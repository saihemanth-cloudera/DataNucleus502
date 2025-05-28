package com.github.jdo;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("DataNucleus TestCase : BugReprSampleCode");
        System.out.println("===================================");
        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("JdoExample");
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try {
            tx.begin();
            MFieldSchema mf1 = new MFieldSchema( "ABC", "String", "III");

            MColumnDescriptor mc1 = new MColumnDescriptor(Arrays.asList(mf1));

            pm.makePersistent(mc1);

            tx.commit();

            tx.begin();
            List<MColumnDescriptor> list = pm.newQuery(MColumnDescriptor.class).executeList();
            list.forEach( cols -> System.out.println(cols.getCols()));
            tx.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        finally {
            if(tx.isActive())
                tx.rollback();

            pm.close();
        }
    }
}
