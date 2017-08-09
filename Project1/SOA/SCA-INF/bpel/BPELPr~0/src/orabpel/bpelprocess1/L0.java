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

/**
 * code spanning class to distribute code among methods/classes
 *  mpc=32
 *  lpm=2,048
 *  lpc=65,536
 *  npm=64
 *  npc=2,048
 */
final class L0 
{
  // load method # 1
  static void initPartnerLinks_2 (IScope __sc, ICubeContext __ctx) throws CubeException
  {
    // there are 1 partnerLinks
    CXPartnerLink __pl;
    // service QName will be set at process initialization time
    __pl = new CXPartnerLink();
    __sc.declareAndSet("bpelprocess1_client", __pl );
    __pl.setName( "bpelprocess1_client" );
    __pl.setPartnerLinkType( C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_4);
    __pl.getMyRole().setName("BPELProcess1Provider" );
    __pl.getMyRole().setPortType( C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_4 );
    
  }

  // load method # 2
  static void initVariables_5 (IScope __sc, ICubeContext __ctx, BaseCubeProcess __that) throws CubeException
  {
    // there are 2 cube variables

    CXTypeVariable t1;
    CXElementVariable e1;
    CXMessageVariable m1;
    CXPart p1;
    org.w3c.dom.Element e2;

    m1 = new CXMessageVariable();
    __sc.declareAndSet("inputVariable",m1);
    m1.setName("inputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_0);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_process_8);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<process xmlns=\"http://xmlns.oracle.com/HelloWorld_NexusINTG_App/Project1/BPELProcess1\"/>\r\n");
    m1.put("payload",e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("outputVariable",m1);
    m1.setName("outputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_BPELProc_6);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_HelloWorld_NexusINTG_App_Project1_BPELProcess1_processR_a);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<processResponse xmlns=\"http://xmlns.oracle.com/HelloWorld_NexusINTG_App/Project1/BPELProcess1\">\r\n   <result/>\r\n</processResponse>\r\n");
    m1.put("payload",e2);
    
    
  }

  // load method # 3
  static void initCorrelationSets_8 (IScope __sc, ICubeContext __ctx) throws CubeException
  {
    // there are no correlation sets
  }

  // load method # 4
  static void initPropertyAliases_11 (IScope __sc, ICubeContext __ctx, Set __pas) throws CubeException
  {
    // there are no property aliases
  }

}

