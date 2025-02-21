package io.yb.kv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "kvinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KVPair {
	@PrimaryKey
	String key;
	String value;
}
