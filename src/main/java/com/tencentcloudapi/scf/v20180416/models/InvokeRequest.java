/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeRequest extends AbstractModel{

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * The value is `RequestResponse` (synchronous) or `Event` (asynchronous). The default value is synchronous.
    */
    @SerializedName("InvocationType")
    @Expose
    private String InvocationType;

    /**
    * Version number of the triggered function
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Function running parameter, which is in the JSON format. Maximum parameter size is 1 MB.
    */
    @SerializedName("ClientContext")
    @Expose
    private String ClientContext;

    /**
    * If this field is specified for a synchronous invocation, the return value will contain a 4-KB log. The value is `None` (default) or `Tail`. If the value is `Tail`, `logMsg` in the return parameter will contain the corresponding function execution log.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Traffic routing config in json format, e.g., {"k":"v"}. Please note that both "k" and "v" must be strings. Up to 1024 bytes allowed.
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get The value is `RequestResponse` (synchronous) or `Event` (asynchronous). The default value is synchronous. 
     * @return InvocationType The value is `RequestResponse` (synchronous) or `Event` (asynchronous). The default value is synchronous.
     */
    public String getInvocationType() {
        return this.InvocationType;
    }

    /**
     * Set The value is `RequestResponse` (synchronous) or `Event` (asynchronous). The default value is synchronous.
     * @param InvocationType The value is `RequestResponse` (synchronous) or `Event` (asynchronous). The default value is synchronous.
     */
    public void setInvocationType(String InvocationType) {
        this.InvocationType = InvocationType;
    }

    /**
     * Get Version number of the triggered function 
     * @return Qualifier Version number of the triggered function
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Version number of the triggered function
     * @param Qualifier Version number of the triggered function
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Function running parameter, which is in the JSON format. Maximum parameter size is 1 MB. 
     * @return ClientContext Function running parameter, which is in the JSON format. Maximum parameter size is 1 MB.
     */
    public String getClientContext() {
        return this.ClientContext;
    }

    /**
     * Set Function running parameter, which is in the JSON format. Maximum parameter size is 1 MB.
     * @param ClientContext Function running parameter, which is in the JSON format. Maximum parameter size is 1 MB.
     */
    public void setClientContext(String ClientContext) {
        this.ClientContext = ClientContext;
    }

    /**
     * Get If this field is specified for a synchronous invocation, the return value will contain a 4-KB log. The value is `None` (default) or `Tail`. If the value is `Tail`, `logMsg` in the return parameter will contain the corresponding function execution log. 
     * @return LogType If this field is specified for a synchronous invocation, the return value will contain a 4-KB log. The value is `None` (default) or `Tail`. If the value is `Tail`, `logMsg` in the return parameter will contain the corresponding function execution log.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set If this field is specified for a synchronous invocation, the return value will contain a 4-KB log. The value is `None` (default) or `Tail`. If the value is `Tail`, `logMsg` in the return parameter will contain the corresponding function execution log.
     * @param LogType If this field is specified for a synchronous invocation, the return value will contain a 4-KB log. The value is `None` (default) or `Tail`. If the value is `Tail`, `logMsg` in the return parameter will contain the corresponding function execution log.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Traffic routing config in json format, e.g., {"k":"v"}. Please note that both "k" and "v" must be strings. Up to 1024 bytes allowed. 
     * @return RoutingKey Traffic routing config in json format, e.g., {"k":"v"}. Please note that both "k" and "v" must be strings. Up to 1024 bytes allowed.
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set Traffic routing config in json format, e.g., {"k":"v"}. Please note that both "k" and "v" must be strings. Up to 1024 bytes allowed.
     * @param RoutingKey Traffic routing config in json format, e.g., {"k":"v"}. Please note that both "k" and "v" must be strings. Up to 1024 bytes allowed.
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    public InvokeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeRequest(InvokeRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.InvocationType != null) {
            this.InvocationType = new String(source.InvocationType);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.ClientContext != null) {
            this.ClientContext = new String(source.ClientContext);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "InvocationType", this.InvocationType);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "ClientContext", this.ClientContext);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

