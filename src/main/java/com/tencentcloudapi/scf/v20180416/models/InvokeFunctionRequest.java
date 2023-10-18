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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeFunctionRequest extends AbstractModel {

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Version or alias of the function. It defaults to `$DEFAULT`.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Function running parameter, which is in the JSON format. Maximum parameter size is 6 MB. This field corresponds to [event input parameter](https://intl.cloud.tencent.com/document/product/583/9210?from_cn_redirect=1#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E).
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * Valid value: `None` (default) or `Tail`. If the value is `Tail`, `log` in the response will contain the corresponding function execution log (up to 4KB).
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Namespace. `default` is used if it’s left empty.
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
     * Get Version or alias of the function. It defaults to `$DEFAULT`. 
     * @return Qualifier Version or alias of the function. It defaults to `$DEFAULT`.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Version or alias of the function. It defaults to `$DEFAULT`.
     * @param Qualifier Version or alias of the function. It defaults to `$DEFAULT`.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Function running parameter, which is in the JSON format. Maximum parameter size is 6 MB. This field corresponds to [event input parameter](https://intl.cloud.tencent.com/document/product/583/9210?from_cn_redirect=1#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E). 
     * @return Event Function running parameter, which is in the JSON format. Maximum parameter size is 6 MB. This field corresponds to [event input parameter](https://intl.cloud.tencent.com/document/product/583/9210?from_cn_redirect=1#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E).
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set Function running parameter, which is in the JSON format. Maximum parameter size is 6 MB. This field corresponds to [event input parameter](https://intl.cloud.tencent.com/document/product/583/9210?from_cn_redirect=1#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E).
     * @param Event Function running parameter, which is in the JSON format. Maximum parameter size is 6 MB. This field corresponds to [event input parameter](https://intl.cloud.tencent.com/document/product/583/9210?from_cn_redirect=1#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E).
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get Valid value: `None` (default) or `Tail`. If the value is `Tail`, `log` in the response will contain the corresponding function execution log (up to 4KB). 
     * @return LogType Valid value: `None` (default) or `Tail`. If the value is `Tail`, `log` in the response will contain the corresponding function execution log (up to 4KB).
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Valid value: `None` (default) or `Tail`. If the value is `Tail`, `log` in the response will contain the corresponding function execution log (up to 4KB).
     * @param LogType Valid value: `None` (default) or `Tail`. If the value is `Tail`, `log` in the response will contain the corresponding function execution log (up to 4KB).
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Namespace. `default` is used if it’s left empty. 
     * @return Namespace Namespace. `default` is used if it’s left empty.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. `default` is used if it’s left empty.
     * @param Namespace Namespace. `default` is used if it’s left empty.
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

    public InvokeFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeFunctionRequest(InvokeFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
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
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

