package io.yb.kv;

import java.util.Optional;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;

import org.springframework.stereotype.Service;

@Service
public class KVService {

	private final KVRepository repository;

	private final CqlSession ycqlSession;

	public KVService(KVRepository repository, CqlSession ycqlSession) {
		this.repository = repository;
		this.ycqlSession = ycqlSession;
	}

	public void saveKeyWithTTL(KVPair info, int ttlInSeconds) {
		String query = "INSERT INTO kvinfo (key, value) VALUES (?, ?) USING TTL ?";
		BoundStatement boundStatement = ycqlSession.prepare(query).bind(info.getKey(), info.getValue(), ttlInSeconds);
		ycqlSession.execute(boundStatement);
	}

	public KVPair saveKey(KVPair info) {
		return repository.save(info);
	}

	public Optional<KVPair> getKey(String id) {
		return repository.findById(id);
	}

	public Iterable<KVPair> getAllKeys() {
		return repository.findAll();
	}

	public void deleteKey(String key) {
		repository.deleteById(key);
	}

}
