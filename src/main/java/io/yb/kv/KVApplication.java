package io.yb.kv;

//import com.datastax.oss.driver.api.core.CqlSession;
//import com.datastax.oss.driver.api.core.CqlSessionBuilder;
//import com.datastax.oss.driver.api.core.config.DefaultDriverOption;
//import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
//import com.datastax.oss.driver.api.core.config.ProgrammaticDriverConfigLoaderBuilder;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class KVApplication {

	public static void main(String[] args) {
		SpringApplication.run(KVApplication.class, args);
	}

//	@Bean
//	public CassandraMappingContext cassandraMapping(BeanFactory beanFactory, CassandraCustomConversions conversions)
//			throws ClassNotFoundException {
//		var context = new CassandraMappingContext();
//		var packages = EntityScanPackages.get(beanFactory).getPackageNames();
//		if (packages.isEmpty() && AutoConfigurationPackages.has(beanFactory)) {
//			packages = AutoConfigurationPackages.get(beanFactory);
//		}
//		if (!packages.isEmpty()) {
//			context.setInitialEntitySet(CassandraEntityClassScanner.scan(packages));
//		}
//		context.setSimpleTypeHolder(conversions.getSimpleTypeHolder());
//		context.setNamingStrategy(SNAKE_CASE);
//		return context;
//	}

	@Autowired
	public Environment env;

//	@Bean
//	public CqlSession cassandraSession() throws Exception {
//		ProgrammaticDriverConfigLoaderBuilder configBuilder = DriverConfigLoader.programmaticBuilder();
//		configBuilder
//				.withInt(DefaultDriverOption.CONNECTION_POOL_LOCAL_SIZE,
//						Integer.parseInt(env.getProperty("spring.cassandra.connection.local.poolsize")))
//				.withString(DefaultDriverOption.LOAD_BALANCING_LOCAL_DATACENTER, "ap-south-1")
////				.withInt(DefaultDriverOption.CONNECTION_POOL_REMOTE_SIZE,
////						Integer.parseInt(env.getProperty("spring.cassandra.connection.remote.poolsize")))
//				.withInt(DefaultDriverOption.CONNECTION_MAX_REQUESTS,
//						Integer.parseInt(env.getProperty("spring.cassandra.connection.maxrequests")))
//				.withDuration(DefaultDriverOption.HEARTBEAT_INTERVAL,
//						Duration.ofSeconds(Long.valueOf(env.getProperty("spring.cassandra.heartbeat.interval"))))
//				.withDuration(DefaultDriverOption.REQUEST_TIMEOUT,
//						Duration.ofMillis(Long
//								.parseLong(env.getProperty("spring.data.cassandra.read-timeout").replace("ms", ""))))
//				.withDuration(DefaultDriverOption.CONNECTION_INIT_QUERY_TIMEOUT, Duration.ofMillis(
//						Long.parseLong(env.getProperty("spring.data.cassandra.connect-timeout").replace("ms", ""))));
//
//		// === SSL Context Setup ===
////		Path truststoreCertPath = Paths.get(
////				env.getProperty("spring.data.ssl.bundle.pem.ycql.truststore.certificate").replace("classpath:", ""));
////
////		SSLContext sslContext = createSslContextFromPem(truststoreCertPath.toString());
//
//		CqlSessionBuilder builder = CqlSession.builder();
//
//		String cp = env.getProperty("spring.data.cassandra.contact-points");
//		int port = Integer.parseInt(env.getProperty("spring.data.cassandra.port"));
//		Arrays.stream(cp.split(","))
//				.map(String::trim)
//				.forEach(host -> builder.addContactPoint(new InetSocketAddress(host, port)));;
//
//		builder.withLocalDatacenter(env.getProperty("spring.data.cassandra.local-datacenter"))
//				.withAuthCredentials(env.getProperty("spring.data.cassandra.username"),
//						env.getProperty("spring.data.cassandra.password"))
//				.withKeyspace(env.getProperty("spring.data.cassandra.keyspace-name"))
//				.withLocalDatacenter(env.getProperty("spring.data.cassandra.local-datacenter"))
////				.withSslContext(sslContext);
//				.withConfigLoader(configBuilder.build());
//
//		boolean enableSsl = Boolean.parseBoolean(env.getProperty("spring.data.cassandra.ssl"));
//
////		if (enableSsl) {
////			String certPath = env.getProperty("spring.data.ssl.bundle.pem.ycql.truststore.certificate");
////			SSLContext sslContext = createSslContextFromPem(certPath);
////			builder.withSslContext(sslContext);
////        }
//
//		return builder.build();
//	}

}
