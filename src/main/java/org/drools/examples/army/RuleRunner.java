package org.drools.examples.army;

import org.kie.api.runtime.KieSession;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

    public class RuleRunner {
        public void runRules(String[] rules, Object[] facts) {
            KieServices ks = KieServices.Factory.get();
            KieContainer kc = ks.getKieClasspathContainer();
            KieSession ksession = kc.newKieSession("ksession1");

            for (Object fact : facts) {
                System.out.println("Inserting fact: " + fact);
                ksession.insert(fact);
            }

            int fired = ksession.fireAllRules();
            System.out.println("Number of rules fired: " + fired);
            ksession.dispose();
        }
    }