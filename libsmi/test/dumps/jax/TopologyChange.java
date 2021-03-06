/*
 * This Java file has been generated by smidump 0.5.0. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

import jax.AgentXOID;
import jax.AgentXVarBind;
import jax.AgentXNotification;
import java.util.Vector;

public class TopologyChange extends AgentXNotification
{

    private final static long[] topologyChange_OID = {1, 3, 6, 1, 2, 1, 17, 0, 2};
    private static AgentXVarBind snmpTrapOID_VarBind =
        new AgentXVarBind(snmpTrapOID_OID,
                          AgentXVarBind.OBJECTIDENTIFIER,
                          new AgentXOID(topologyChange_OID));



    public TopologyChange() {
        AgentXOID oid;
        AgentXVarBind varBind;

        // add the snmpTrapOID object
        varBindList.addElement(snmpTrapOID_VarBind);
    }

    public Vector getVarBindList() {
        return varBindList;
    }

}

