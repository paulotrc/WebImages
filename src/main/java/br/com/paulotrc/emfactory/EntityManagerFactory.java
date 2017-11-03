//package br.com.paulotrc.emfactory;
//
//import javax.persistence.Persistence;
//
//public class EntityManagerFactory {
//
//		  private static final String PERSISTENCE_UNIT_NAME = "WebImages_PU";
//		  private static EntityManagerFactory factory;
//
//		  public static EntityManagerFactory getEntityManagerFactory() {
//		    if (factory == null) {
//		      factory = (EntityManagerFactory) Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//		    }
//		    return factory;
//		  }
//}