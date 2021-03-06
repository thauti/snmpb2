/*
 * This Java file has been generated by smidump 0.5.0. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the table row dot1dStpPortEntry defined in BRIDGE-MIB.

    @version 1
    @author  smidump 0.5.0
    @see     AgentXTable, AgentXEntry
 */

import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXEntry;

public class Dot1dStpPortEntry extends AgentXEntry
{

    protected int dot1dStpPort = 0;
    protected int dot1dStpPortPriority = 0;
    protected int undo_dot1dStpPortPriority = 0;
    protected int dot1dStpPortState = 0;
    protected int dot1dStpPortEnable = 0;
    protected int undo_dot1dStpPortEnable = 0;
    protected int dot1dStpPortPathCost = 0;
    protected int undo_dot1dStpPortPathCost = 0;
    protected byte[] dot1dStpPortDesignatedRoot = new byte[8];
    protected int dot1dStpPortDesignatedCost = 0;
    protected byte[] dot1dStpPortDesignatedBridge = new byte[8];
    protected byte[] dot1dStpPortDesignatedPort = new byte[2];
    protected long dot1dStpPortForwardTransitions = 0;
    protected int dot1dStpPortPathCost32 = 0;
    protected int undo_dot1dStpPortPathCost32 = 0;

    public Dot1dStpPortEntry(int dot1dStpPort)
    {
        this.dot1dStpPort = dot1dStpPort;

        instance.append(dot1dStpPort);
    }

    public int get_dot1dStpPort()
    {
        return dot1dStpPort;
    }

    public int get_dot1dStpPortPriority()
    {
        return dot1dStpPortPriority;
    }

    public int set_dot1dStpPortPriority(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_dot1dStpPortPriority = dot1dStpPortPriority;
            dot1dStpPortPriority = value;
            break;
        case AgentXSetPhase.UNDO:
            dot1dStpPortPriority = undo_dot1dStpPortPriority;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_dot1dStpPortState()
    {
        return dot1dStpPortState;
    }

    public int get_dot1dStpPortEnable()
    {
        return dot1dStpPortEnable;
    }

    public int set_dot1dStpPortEnable(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_dot1dStpPortEnable = dot1dStpPortEnable;
            dot1dStpPortEnable = value;
            break;
        case AgentXSetPhase.UNDO:
            dot1dStpPortEnable = undo_dot1dStpPortEnable;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_dot1dStpPortPathCost()
    {
        return dot1dStpPortPathCost;
    }

    public int set_dot1dStpPortPathCost(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_dot1dStpPortPathCost = dot1dStpPortPathCost;
            dot1dStpPortPathCost = value;
            break;
        case AgentXSetPhase.UNDO:
            dot1dStpPortPathCost = undo_dot1dStpPortPathCost;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public byte[] get_dot1dStpPortDesignatedRoot()
    {
        return dot1dStpPortDesignatedRoot;
    }

    public int get_dot1dStpPortDesignatedCost()
    {
        return dot1dStpPortDesignatedCost;
    }

    public byte[] get_dot1dStpPortDesignatedBridge()
    {
        return dot1dStpPortDesignatedBridge;
    }

    public byte[] get_dot1dStpPortDesignatedPort()
    {
        return dot1dStpPortDesignatedPort;
    }

    public long get_dot1dStpPortForwardTransitions()
    {
        return dot1dStpPortForwardTransitions;
    }

    public int get_dot1dStpPortPathCost32()
    {
        return dot1dStpPortPathCost32;
    }

    public int set_dot1dStpPortPathCost32(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_dot1dStpPortPathCost32 = dot1dStpPortPathCost32;
            dot1dStpPortPathCost32 = value;
            break;
        case AgentXSetPhase.UNDO:
            dot1dStpPortPathCost32 = undo_dot1dStpPortPathCost32;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
}

