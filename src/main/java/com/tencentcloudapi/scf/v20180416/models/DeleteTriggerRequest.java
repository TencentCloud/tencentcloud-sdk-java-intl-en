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

public class DeleteTriggerRequest extends AbstractModel{

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Name of the trigger to be deleted
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Type of the trigger to be deleted. Currently, COS, CMQ, timer, and ckafka triggers are supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * This field is required if a COS trigger is to be deleted. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Function version information
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
     * Get Name of the trigger to be deleted 
     * @return TriggerName Name of the trigger to be deleted
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Name of the trigger to be deleted
     * @param TriggerName Name of the trigger to be deleted
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Type of the trigger to be deleted. Currently, COS, CMQ, timer, and ckafka triggers are supported. 
     * @return Type Type of the trigger to be deleted. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the trigger to be deleted. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     * @param Type Type of the trigger to be deleted. Currently, COS, CMQ, timer, and ckafka triggers are supported.
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get This field is required if a COS trigger is to be deleted. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted. 
     * @return TriggerDesc This field is required if a COS trigger is to be deleted. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set This field is required if a COS trigger is to be deleted. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     * @param TriggerDesc This field is required if a COS trigger is to be deleted. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get Function version information 
     * @return Qualifier Function version information
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version information
     * @param Qualifier Function version information
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
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

