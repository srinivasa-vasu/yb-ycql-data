package io.yb.kv;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kvinfo")
public class KVController {

	private final KVService kvService;

	public KVController(KVService kvService) {
		this.kvService = kvService;
	}

	@PostMapping("/ttl/{seconds}")
	public void saveKeyWithTTL(@RequestBody KVPair info, @PathVariable int seconds) {
		kvService.saveKeyWithTTL(info, seconds);
	}

	@PostMapping
	public KVPair saveKey(@RequestBody KVPair info) {
		return kvService.saveKey(info);
	}

	@GetMapping("/{key}")
	public Optional<KVPair> getKey(@PathVariable String key) {
		return kvService.getKey(key);
	}

	@GetMapping
	public Iterable<KVPair> getAllKeys() {
		return kvService.getAllKeys();
	}

	@DeleteMapping("/{key}")
	public void deleteKey(@PathVariable String key) {
		kvService.deleteKey(key);
	}

}
