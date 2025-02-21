package io.yb.kv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

}
