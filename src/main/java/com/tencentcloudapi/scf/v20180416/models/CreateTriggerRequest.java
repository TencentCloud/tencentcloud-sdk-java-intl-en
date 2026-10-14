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

public class CreateTriggerRequest extends AbstractModel {

    /**
    * Function name bound to the created trigger
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Name of the trigger to create. If it is a scheduled trigger, the name supports English letters, digits, hyphens, and underscores, up to 100 characters. If it is a COS trigger, it must be the access domain of the corresponding COS storage bucket suitable for the XML API (for example, 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com). For other triggers, see the parameter description of the specific trigger binding.
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Trigger type. Currently supports cos, cls, timer, ckafka, and http types. To create a function URL, please use the http type. See [Creating a Function URL](https://www.tencentcloud.com/document/product/583/100227?from_cn_redirect=1#33bbbda4-9131-48a6-ac37-ac62ffe01424). To create a cls trigger, see CLS Creating Delivery SCF Task.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Parameters corresponding to the trigger. For details, see [Trigger Description](https://www.tencentcloud.com/document/product/583/39901?from_cn_redirect=1).
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Namespace of the function
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Version or alias that the trigger takes effect on. It is recommended to fill in $DEFAULT for future grayscale release. Default value: $LATEST.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Initial status of the trigger. OPEN means enabling, and CLOSE means disabling.
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * User-defined parameter. Only timer triggers are supported.
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
    * Trigger description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Function name bound to the created trigger 
     * @return FunctionName Function name bound to the created trigger
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name bound to the created trigger
     * @param FunctionName Function name bound to the created trigger
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Name of the trigger to create. If it is a scheduled trigger, the name supports English letters, digits, hyphens, and underscores, up to 100 characters. If it is a COS trigger, it must be the access domain of the corresponding COS storage bucket suitable for the XML API (for example, 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com). For other triggers, see the parameter description of the specific trigger binding. 
     * @return TriggerName Name of the trigger to create. If it is a scheduled trigger, the name supports English letters, digits, hyphens, and underscores, up to 100 characters. If it is a COS trigger, it must be the access domain of the corresponding COS storage bucket suitable for the XML API (for example, 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com). For other triggers, see the parameter description of the specific trigger binding.
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Name of the trigger to create. If it is a scheduled trigger, the name supports English letters, digits, hyphens, and underscores, up to 100 characters. If it is a COS trigger, it must be the access domain of the corresponding COS storage bucket suitable for the XML API (for example, 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com). For other triggers, see the parameter description of the specific trigger binding.
     * @param TriggerName Name of the trigger to create. If it is a scheduled trigger, the name supports English letters, digits, hyphens, and underscores, up to 100 characters. If it is a COS trigger, it must be the access domain of the corresponding COS storage bucket suitable for the XML API (for example, 5401-5ff414-12345.cos.ap-shanghai.myqcloud.com). For other triggers, see the parameter description of the specific trigger binding.
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Trigger type. Currently supports cos, cls, timer, ckafka, and http types. To create a function URL, please use the http type. See [Creating a Function URL](https://www.tencentcloud.com/document/product/583/100227?from_cn_redirect=1#33bbbda4-9131-48a6-ac37-ac62ffe01424). To create a cls trigger, see CLS Creating Delivery SCF Task. 
     * @return Type Trigger type. Currently supports cos, cls, timer, ckafka, and http types. To create a function URL, please use the http type. See [Creating a Function URL](https://www.tencentcloud.com/document/product/583/100227?from_cn_redirect=1#33bbbda4-9131-48a6-ac37-ac62ffe01424). To create a cls trigger, see CLS Creating Delivery SCF Task.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type. Currently supports cos, cls, timer, ckafka, and http types. To create a function URL, please use the http type. See [Creating a Function URL](https://www.tencentcloud.com/document/product/583/100227?from_cn_redirect=1#33bbbda4-9131-48a6-ac37-ac62ffe01424). To create a cls trigger, see CLS Creating Delivery SCF Task.
     * @param Type Trigger type. Currently supports cos, cls, timer, ckafka, and http types. To create a function URL, please use the http type. See [Creating a Function URL](https://www.tencentcloud.com/document/product/583/100227?from_cn_redirect=1#33bbbda4-9131-48a6-ac37-ac62ffe01424). To create a cls trigger, see CLS Creating Delivery SCF Task.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Parameters corresponding to the trigger. For details, see [Trigger Description](https://www.tencentcloud.com/document/product/583/39901?from_cn_redirect=1). 
     * @return TriggerDesc Parameters corresponding to the trigger. For details, see [Trigger Description](https://www.tencentcloud.com/document/product/583/39901?from_cn_redirect=1).
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set Parameters corresponding to the trigger. For details, see [Trigger Description](https://www.tencentcloud.com/document/product/583/39901?from_cn_redirect=1).
     * @param TriggerDesc Parameters corresponding to the trigger. For details, see [Trigger Description](https://www.tencentcloud.com/document/product/583/39901?from_cn_redirect=1).
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
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
     * Get Version or alias that the trigger takes effect on. It is recommended to fill in $DEFAULT for future grayscale release. Default value: $LATEST. 
     * @return Qualifier Version or alias that the trigger takes effect on. It is recommended to fill in $DEFAULT for future grayscale release. Default value: $LATEST.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Version or alias that the trigger takes effect on. It is recommended to fill in $DEFAULT for future grayscale release. Default value: $LATEST.
     * @param Qualifier Version or alias that the trigger takes effect on. It is recommended to fill in $DEFAULT for future grayscale release. Default value: $LATEST.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Initial status of the trigger. OPEN means enabling, and CLOSE means disabling. 
     * @return Enable Initial status of the trigger. OPEN means enabling, and CLOSE means disabling.
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set Initial status of the trigger. OPEN means enabling, and CLOSE means disabling.
     * @param Enable Initial status of the trigger. OPEN means enabling, and CLOSE means disabling.
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get User-defined parameter. Only timer triggers are supported. 
     * @return CustomArgument User-defined parameter. Only timer triggers are supported.
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set User-defined parameter. Only timer triggers are supported.
     * @param CustomArgument User-defined parameter. Only timer triggers are supported.
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Get Trigger description. 
     * @return Description Trigger description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Trigger description.
     * @param Description Trigger description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateTriggerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerRequest(CreateTriggerRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.CustomArgument != null) {
            this.CustomArgument = new String(source.CustomArgument);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
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
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

