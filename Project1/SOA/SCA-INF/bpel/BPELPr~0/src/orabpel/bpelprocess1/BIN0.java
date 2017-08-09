package orabpel.bpelprocess1;

/**
 * CONFIDENTIAL AND PROPRIETARY SOURCE CODE OF ORACLE CORPORATION
 * Copyright (c) 2001, 2009, Oracle and/or its affiliates. 
 * All rights reserved. 
 *
 * Use of this Source Code is subject to the terms of the applicable
 * license agreement from Oracle Corporation.
 *
 * The copyright notice(s) in this Source Code does not indicate
 * actual or intended publication of this Source Code.
 */
// java imports
import java.lang.*;
import java.util.*;
import javax.xml.namespace.QName;

// collaxa/engine imports
import com.collaxa.cube.CubeException;
import com.collaxa.cube.engine.core.*;
import com.collaxa.cube.engine.core.map.*;

// collaxa/engine BPEL v1 nodes/blocks/wmp
import com.collaxa.cube.engine.ext.bpel.v1.*;
import com.collaxa.cube.engine.ext.bpel.v1.nodes.*;
import com.collaxa.cube.engine.ext.bpel.v1.blocks.*;
import com.collaxa.cube.engine.ext.bpel.v1.wmp.*;

// more collaxa/engine imports
import com.collaxa.cube.engine.ICubeContext;
import com.collaxa.cube.CubeDefs;
import com.collaxa.cube.engine.CubeEngineDefs;
import com.collaxa.cube.engine.types.bpel.*;
import com.collaxa.cube.engine.util.*;
import com.collaxa.cube.engine.delivery.*;

// BPEL client
import com.oracle.bpel.client.*;

// constants from symbol table
import orabpel.bpelprocess1.*;

class BIN0 
{
  static void addMaps$process ( BPELCubeMap p, ICubeContext __ctx) throws CubeException
  {
    addMaps$process$0(p,__ctx);
  }

  static void addMaps$process$0 ( BPELCubeMap p, ICubeContext __ctx) throws CubeException
  {
    ICubeBlock b; ICubeNode n;
    BPELProcessBlock _0 = new BPELProcessBlock(); _0.setId("BpPrc0"); p.add(_0);
    // standard init
    _0.setLineNumber(28);
    _0.setLocation("A");
    _0.setName("BPELProcess1");
    _0.registerNSPrefix("","http://schemas.xmlsoap.org/ws/2003/03/business-process/");
    _0.registerNSPrefix("client","http://xmlns.oracle.com/HelloWorld_NexusINTG_App/Project1/BPELProcess1");
    _0.registerNSPrefix("bpws","http://schemas.xmlsoap.org/ws/2003/03/business-process/");
    _0.registerNSPrefix("oraext","http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc");
    _0.registerNSPrefix("ids","http://xmlns.oracle.com/bpel/services/IdentityService/xpath");
    _0.registerNSPrefix("bpel2","http://docs.oasis-open.org/wsbpel/2.0/process/executable");
    _0.registerNSPrefix("bpm","http://xmlns.oracle.com/bpmn20/extensions");
    _0.registerNSPrefix("dvm","http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue");
    _0.registerNSPrefix("xdk","http://schemas.oracle.com/bpel/extension/xpath/function/xdk");
    _0.registerNSPrefix("ldap","http://schemas.oracle.com/xpath/extension/ldap");
    _0.registerNSPrefix("xp20","http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20");
    _0.registerNSPrefix("ora","http://schemas.oracle.com/xpath/extension");
    _0.registerNSPrefix("hwf","http://xmlns.oracle.com/bpel/workflow/xpath");
    _0.registerNSPrefix("ess","http://xmlns.oracle.com/scheduler");
    _0.registerNSPrefix("xref","http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions");
    _0.registerNSPrefix("bpelx","http://schemas.oracle.com/bpel/extension");
    // specialized init
    _0.setEntryTokensVA("BpTry0");
    _0.setMethodName("process");
    _0.setTransactionType("not-supported");
    
    BPELTryBlock _1 = new BPELTryBlock(); _1.setId("BpTry0"); _1.setParentBlockId("BpPrc0"); p.add(_1);
    // standard init
    _1.setLineNumber(28);
    _1.setExitTokensVA("BpPrc0");
    // specialized init
    _1.setEntryTokensVA("BpSeq0");
    _1.setHasEventHandlers(false);
    
    BPELSequenceBlock _2 = new BPELSequenceBlock(); _2.setId("BpSeq0"); _2.setParentBlockId("BpTry0"); p.add(_2);
    // standard init
    _2.setLineNumber(73);
    _2.setLocation("AD");
    _2.setName("main");
    _2.setExitTokensVA("BpTry0");
    // specialized init
    _2.setEntryTokensVA("BpRcv0");
    
    BPEL1ReceiveNode _3 = new BPEL1ReceiveNode(); _3.setId("BpRcv0"); _3.setParentBlockId("BpSeq0"); p.add(_3);
    // standard init
    _3.setLineNumber(76);
    _3.setLocation("ADA");
    _3.setName("receiveInput");
    _3.setExitTokensVA("BpAss0");
    // specialized init
    _3.setIsCreateInstance(true);
    _3.setPartnerLinkName("bpelprocess1_client");
    _3.setOperationName("process");
    _3.setVariableName("inputVariable");
    _3.setIsTwoWay(true);
    _3.setInputMessageType(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_0);
    _3.setPortType(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_4);
    _3.setMyRole("BPELProcess1Provider");
    _3.setIsVariableReadOnly(true);
    
    BPEL1AssignNode _4 = new BPEL1AssignNode(); _4.setId("BpAss0"); _4.setParentBlockId("BpSeq0"); p.add(_4);
    // standard init
    _4.setLineNumber(77);
    _4.setLocation("ADB");
    _4.setName("Assign1");
    _4.setExitTokensVA("BpRpl0");
    _4.setEarlyPurgeVariables(new String[] {"inputVariable"});
    // specialized init
    List<CXAssignFromToOp> _$0 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp op;CXFrom from;CXTo to;
      
      op = new CXAssignFromToOp();
      op.setLineNumber(78);
      op.setLocation("ADBA");
      op.setOperation(CXAssignFromToOp.OP_COPY);
      from = new CXFrom();
      from.setLineNumber(79);
      from.setLocation("ADBAA");
      from.setExpression("concat(\"Hello \",bpws:getVariableData('inputVariable','payload','/client:process/client:input'))");
      // from expr holder
      op.setFrom(from);
      op.setIgnoreMissingFromData(false);
      op.setInsertMissingToData(0);
      op.setCopyQName(false);
      to = new CXTo();
      to.setLineNumber(80);
      to.setLocation("ADBAB");
      to.setPart("payload");
      to.setQuery("/client:processResponse/client:result");
      to.setVariable("outputVariable");
      to.setContiguousXPath(false);
      op.setTo(to);
      
      op.setParentContext(_4);
      _$0.add(op);
      
    }

    _4.setOperations(_$0);
    
    BPEL1ReplyNode _5 = new BPEL1ReplyNode(); _5.setId("BpRpl0"); _5.setParentBlockId("BpSeq0"); p.add(_5);
    // standard init
    _5.setLineNumber(84);
    _5.setLocation("ADC");
    _5.setName("replyOutput");
    _5.setExitTokensVA("BpSeq0");
    _5.setEarlyPurgeVariables(new String[] {"outputVariable"});
    // specialized init
/**
     * reply's variable name
 */
    _5.setVariableName("outputVariable");
    _5.setOperationName("process");
/**
     * reply's partner name
 */
    _5.setPartnerLinkName("bpelprocess1_client");
    _5.setMessageType(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_6);
    
  }

}

