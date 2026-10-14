/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class DeleteTriggerRequest extends AbstractModel {

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Trigger name to delete
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Trigger type to delete. Currently only `timer`, `ckafka`, `apigw`, `cls`, `cos`, `cmq`, and `http` are supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Namespace of the function
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * If the trigger type to delete is COS trigger, this field must be specified, storing data in JSON format {"event":"cos:ObjectCreated:*"}. The data content is in the same format as this field in the SetTrigger API. If the trigger type to delete is scheduled trigger or CMQ trigger, this field can be unspecified.
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * The version or alias that the trigger to be deleted actually points to. Default value: $LATEST.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

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
     * Get Trigger name to delete 
     * @return TriggerName Trigger name to delete
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Trigger name to delete
     * @param TriggerName Trigger name to delete
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Trigger type to delete. Currently only `timer`, `ckafka`, `apigw`, `cls`, `cos`, `cmq`, and `http` are supported. 
     * @return Type Trigger type to delete. Currently only `timer`, `ckafka`, `apigw`, `cls`, `cos`, `cmq`, and `http` are supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type to delete. Currently only `timer`, `ckafka`, `apigw`, `cls`, `cos`, `cmq`, and `http` are supported.
     * @param Type Trigger type to delete. Currently only `timer`, `ckafka`, `apigw`, `cls`, `cos`, `cmq`, and `http` are supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Namespace of the function 
     * @return Namespace Namespace of the function
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the function
     * @param Namespace Namespace of the function
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get If the trigger type to delete is COS trigger, this field must be specified, storing data in JSON format {"event":"cos:ObjectCreated:*"}. The data content is in the same format as this field in the SetTrigger API. If the trigger type to delete is scheduled trigger or CMQ trigger, this field can be unspecified. 
     * @return TriggerDesc If the trigger type to delete is COS trigger, this field must be specified, storing data in JSON format {"event":"cos:ObjectCreated:*"}. The data content is in the same format as this field in the SetTrigger API. If the trigger type to delete is scheduled trigger or CMQ trigger, this field can be unspecified.
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set If the trigger type to delete is COS trigger, this field must be specified, storing data in JSON format {"event":"cos:ObjectCreated:*"}. The data content is in the same format as this field in the SetTrigger API. If the trigger type to delete is scheduled trigger or CMQ trigger, this field can be unspecified.
     * @param TriggerDesc If the trigger type to delete is COS trigger, this field must be specified, storing data in JSON format {"event":"cos:ObjectCreated:*"}. The data content is in the same format as this field in the SetTrigger API. If the trigger type to delete is scheduled trigger or CMQ trigger, this field can be unspecified.
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get The version or alias that the trigger to be deleted actually points to. Default value: $LATEST. 
     * @return Qualifier The version or alias that the trigger to be deleted actually points to. Default value: $LATEST.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set The version or alias that the trigger to be deleted actually points to. Default value: $LATEST.
     * @param Qualifier The version or alias that the trigger to be deleted actually points to. Default value: $LATEST.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public DeleteTriggerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTriggerRequest(DeleteTriggerRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

