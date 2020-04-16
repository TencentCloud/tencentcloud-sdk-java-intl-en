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

public class CreateTriggerRequest extends AbstractModel{

    /**
    * Name of the function bound to the new trigger
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Name of a new trigger. For a timer trigger, the name can contain up to 100 letters, digits, dashes, and underscores; for a COS trigger, it should be an access domain name of the corresponding COS bucket applicable to the XML API (e.g., 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com); for other triggers, please see the descriptions of parameters bound to the specific trigger.
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Trigger type. Currently, COS, CMQ, timer, and ckafka triggers are supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * For parameters of triggers, see [Trigger Description](https://cloud.tencent.com/document/product/583/39901)
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function version
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Initial enabling status of the trigger. `OPEN` indicates enabled, and `CLOSE` indicates disabled.
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
     * Get Name of the function bound to the new trigger 
     * @return FunctionName Name of the function bound to the new trigger
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function bound to the new trigger
     * @param FunctionName Name of the function bound to the new trigger
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Name of a new trigger. For a timer trigger, the name can contain up to 100 letters, digits, dashes, and underscores; for a COS trigger, it should be an access domain name of the corresponding COS bucket applicable to the XML API (e.g., 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com); for other triggers, please see the descriptions of parameters bound to the specific trigger. 
     * @return TriggerName Name of a new trigger. For a timer trigger, the name can contain up to 100 letters, digits, dashes, and underscores; for a COS trigger, it should be an access domain name of the corresponding COS bucket applicable to the XML API (e.g., 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com); for other triggers, please see the descriptions of parameters bound to the specific trigger.
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Name of a new trigger. For a timer trigger, the name can contain up to 100 letters, digits, dashes, and underscores; for a COS trigger, it should be an access domain name of the corresponding COS bucket applicable to the XML API (e.g., 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com); for other triggers, please see the descriptions of parameters bound to the specific trigger.
     * @param TriggerName Name of a new trigger. For a timer trigger, the name can contain up to 100 letters, digits, dashes, and underscores; for a COS trigger, it should be an access domain name of the corresponding COS bucket applicable to the XML API (e.g., 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com); for other triggers, please see the descriptions of parameters bound to the specific trigger.
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Trigger type. Currently, COS, CMQ, timer, and ckafka triggers are supported. 
     * @return Type Trigger type. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     * @param Type Trigger type. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get For parameters of triggers, see [Trigger Description](https://cloud.tencent.com/document/product/583/39901) 
     * @return TriggerDesc For parameters of triggers, see [Trigger Description](https://cloud.tencent.com/document/product/583/39901)
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set For parameters of triggers, see [Trigger Description](https://cloud.tencent.com/document/product/583/39901)
     * @param TriggerDesc For parameters of triggers, see [Trigger Description](https://cloud.tencent.com/document/product/583/39901)
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get Function namespace 
     * @return Namespace Function namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace
     * @param Namespace Function namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function version 
     * @return Qualifier Function version
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version
     * @param Qualifier Function version
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Initial enabling status of the trigger. `OPEN` indicates enabled, and `CLOSE` indicates disabled. 
     * @return Enable Initial enabling status of the trigger. `OPEN` indicates enabled, and `CLOSE` indicates disabled.
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Initial enabling status of the trigger. `OPEN` indicates enabled, and `CLOSE` indicates disabled.
     * @param Enable Initial enabling status of the trigger. `OPEN` indicates enabled, and `CLOSE` indicates disabled.
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

