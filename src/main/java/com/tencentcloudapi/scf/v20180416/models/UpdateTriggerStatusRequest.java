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

public class UpdateTriggerStatusRequest extends AbstractModel{

    /**
    * Initial status of the trigger. Values: `OPEN` (enabled); `CLOSE` disabled)
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * Function name.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Trigger name
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Trigger Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Function version. It defaults to `$LATEST`. It’s recommended to use `[$DEFAULT](https://intl.cloud.tencent.com/document/product/583/36149?from_cn_redirect=1#.E9.BB.98.E8.AE.A4.E5.88.AB.E5.90.8D)` for canary release.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * To update a COS trigger, this field is required. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
     * Get Initial status of the trigger. Values: `OPEN` (enabled); `CLOSE` disabled) 
     * @return Enable Initial status of the trigger. Values: `OPEN` (enabled); `CLOSE` disabled)
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Initial status of the trigger. Values: `OPEN` (enabled); `CLOSE` disabled)
     * @param Enable Initial status of the trigger. Values: `OPEN` (enabled); `CLOSE` disabled)
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Function name. 
     * @return FunctionName Function name.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name.
     * @param FunctionName Function name.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Trigger name 
     * @return TriggerName Trigger name
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Trigger name
     * @param TriggerName Trigger name
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Trigger Type 
     * @return Type Trigger Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger Type
     * @param Type Trigger Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Function version. It defaults to `$LATEST`. It’s recommended to use `[$DEFAULT](https://intl.cloud.tencent.com/document/product/583/36149?from_cn_redirect=1#.E9.BB.98.E8.AE.A4.E5.88.AB.E5.90.8D)` for canary release. 
     * @return Qualifier Function version. It defaults to `$LATEST`. It’s recommended to use `[$DEFAULT](https://intl.cloud.tencent.com/document/product/583/36149?from_cn_redirect=1#.E9.BB.98.E8.AE.A4.E5.88.AB.E5.90.8D)` for canary release.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version. It defaults to `$LATEST`. It’s recommended to use `[$DEFAULT](https://intl.cloud.tencent.com/document/product/583/36149?from_cn_redirect=1#.E9.BB.98.E8.AE.A4.E5.88.AB.E5.90.8D)` for canary release.
     * @param Qualifier Function version. It defaults to `$LATEST`. It’s recommended to use `[$DEFAULT](https://intl.cloud.tencent.com/document/product/583/36149?from_cn_redirect=1#.E9.BB.98.E8.AE.A4.E5.88.AB.E5.90.8D)` for canary release.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
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
     * Get To update a COS trigger, this field is required. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted. 
     * @return TriggerDesc To update a COS trigger, this field is required. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set To update a COS trigger, this field is required. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     * @param TriggerDesc To update a COS trigger, this field is required. It stores the data {"event":"cos:ObjectCreated:*"} in the JSON format. The data content of this field is in the same format as that of SetTrigger. This field is optional if a scheduled trigger or CMQ trigger is to be deleted.
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    public UpdateTriggerStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerStatusRequest(UpdateTriggerStatusRequest source) {
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);

    }
}

