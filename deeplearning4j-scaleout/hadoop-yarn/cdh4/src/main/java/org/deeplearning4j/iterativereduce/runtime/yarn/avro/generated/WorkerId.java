/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated;
@SuppressWarnings("all")
@org.apache.avro.specific.FixedSize(32)
public class WorkerId extends org.apache.avro.specific.SpecificFixed {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"WorkerId\",\"namespace\":\"com.cloudera.org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated\",\"size\":32}");
  
  /** Creates a new WorkerId */
  public WorkerId() {
    super();
  }
  
  /** Creates a new WorkerId with the given bytes */
  public WorkerId(byte[] bytes) {
    super(bytes);
  }
}