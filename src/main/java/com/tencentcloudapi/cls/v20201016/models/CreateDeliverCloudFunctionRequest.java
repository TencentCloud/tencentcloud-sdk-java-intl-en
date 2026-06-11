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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeliverCloudFunctionRequest extends AbstractModel {

    /**
    * TopicId to which the Shipping Rule belongs.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Name of the cloud function for delivery. Only event functions (https://www.tencentcloud.com/document/product/583/9694?from_cn_redirect=1#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) (function type selection (https://www.tencentcloud.com/document/product/583/73483?from_cn_redirect=1)) are supported.
Get function information by [getting the function list](https://www.tencentcloud.com/document/product/583/18582?from_cn_redirect=1).
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Namespace. See [Namespace management](https://www.tencentcloud.com/document/product/583/35913?from_cn_redirect=1).
-Obtain the Name by listing the namespace list (https://www.tencentcloud.com/document/product/583/37158?from_cn_redirect=1).
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function version.
-Get the function version by [querying the function version](https://www.tencentcloud.com/document/product/583/37162?from_cn_redirect=1).
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Maximum waiting time for delivery. Unit: seconds. Default: 60.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Maximum number of messages to deliver. Default is 100. Supported range [1,10000].
    */
    @SerializedName("MaxMsgNum")
    @Expose
    private Long MaxMsgNum;

    /**
     * Get TopicId to which the Shipping Rule belongs.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). 
     * @return TopicId TopicId to which the Shipping Rule belongs.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set TopicId to which the Shipping Rule belongs.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     * @param TopicId TopicId to which the Shipping Rule belongs.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Name of the cloud function for delivery. Only event functions (https://www.tencentcloud.com/document/product/583/9694?from_cn_redirect=1#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) (function type selection (https://www.tencentcloud.com/document/product/583/73483?from_cn_redirect=1)) are supported.
Get function information by [getting the function list](https://www.tencentcloud.com/document/product/583/18582?from_cn_redirect=1). 
     * @return FunctionName Name of the cloud function for delivery. Only event functions (https://www.tencentcloud.com/document/product/583/9694?from_cn_redirect=1#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) (function type selection (https://www.tencentcloud.com/document/product/583/73483?from_cn_redirect=1)) are supported.
Get function information by [getting the function list](https://www.tencentcloud.com/document/product/583/18582?from_cn_redirect=1).
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the cloud function for delivery. Only event functions (https://www.tencentcloud.com/document/product/583/9694?from_cn_redirect=1#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) (function type selection (https://www.tencentcloud.com/document/product/583/73483?from_cn_redirect=1)) are supported.
Get function information by [getting the function list](https://www.tencentcloud.com/document/product/583/18582?from_cn_redirect=1).
     * @param FunctionName Name of the cloud function for delivery. Only event functions (https://www.tencentcloud.com/document/product/583/9694?from_cn_redirect=1#scf-.E4.BA.8B.E4.BB.B6.E5.87.BD.E6.95.B0) (function type selection (https://www.tencentcloud.com/document/product/583/73483?from_cn_redirect=1)) are supported.
Get function information by [getting the function list](https://www.tencentcloud.com/document/product/583/18582?from_cn_redirect=1).
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Namespace. See [Namespace management](https://www.tencentcloud.com/document/product/583/35913?from_cn_redirect=1).
-Obtain the Name by listing the namespace list (https://www.tencentcloud.com/document/product/583/37158?from_cn_redirect=1). 
     * @return Namespace Namespace. See [Namespace management](https://www.tencentcloud.com/document/product/583/35913?from_cn_redirect=1).
-Obtain the Name by listing the namespace list (https://www.tencentcloud.com/document/product/583/37158?from_cn_redirect=1).
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. See [Namespace management](https://www.tencentcloud.com/document/product/583/35913?from_cn_redirect=1).
-Obtain the Name by listing the namespace list (https://www.tencentcloud.com/document/product/583/37158?from_cn_redirect=1).
     * @param Namespace Namespace. See [Namespace management](https://www.tencentcloud.com/document/product/583/35913?from_cn_redirect=1).
-Obtain the Name by listing the namespace list (https://www.tencentcloud.com/document/product/583/37158?from_cn_redirect=1).
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function version.
-Get the function version by [querying the function version](https://www.tencentcloud.com/document/product/583/37162?from_cn_redirect=1). 
     * @return Qualifier Function version.
-Get the function version by [querying the function version](https://www.tencentcloud.com/document/product/583/37162?from_cn_redirect=1).
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version.
-Get the function version by [querying the function version](https://www.tencentcloud.com/document/product/583/37162?from_cn_redirect=1).
     * @param Qualifier Function version.
-Get the function version by [querying the function version](https://www.tencentcloud.com/document/product/583/37162?from_cn_redirect=1).
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Maximum waiting time for delivery. Unit: seconds. Default: 60. 
     * @return Timeout Maximum waiting time for delivery. Unit: seconds. Default: 60.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum waiting time for delivery. Unit: seconds. Default: 60.
     * @param Timeout Maximum waiting time for delivery. Unit: seconds. Default: 60.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Maximum number of messages to deliver. Default is 100. Supported range [1,10000]. 
     * @return MaxMsgNum Maximum number of messages to deliver. Default is 100. Supported range [1,10000].
     */
    public Long getMaxMsgNum() {
        return this.MaxMsgNum;
    }

    /**
     * Set Maximum number of messages to deliver. Default is 100. Supported range [1,10000].
     * @param MaxMsgNum Maximum number of messages to deliver. Default is 100. Supported range [1,10000].
     */
    public void setMaxMsgNum(Long MaxMsgNum) {
        this.MaxMsgNum = MaxMsgNum;
    }

    public CreateDeliverCloudFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeliverCloudFunctionRequest(CreateDeliverCloudFunctionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.MaxMsgNum != null) {
            this.MaxMsgNum = new Long(source.MaxMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "MaxMsgNum", this.MaxMsgNum);

    }
}

