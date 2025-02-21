package io.yb.kv;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KVRepository extends CassandraRepository<KVPair, String> {
}
