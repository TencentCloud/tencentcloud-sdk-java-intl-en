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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAggregateConfigDeliverRequest extends AbstractModel {

    /**
    * Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Account group ID.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Delivery service name
    */
    @SerializedName("DeliverName")
    @Expose
    private String DeliverName;

    /**
    * Six-segment resource format  
COS:qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
    */
    @SerializedName("TargetArn")
    @Expose
    private String TargetArn;

    /**
    * Resource prefix.
    */
    @SerializedName("DeliverPrefix")
    @Expose
    private String DeliverPrefix;

    /**
    * Delivery type. Valid value: COS and CLS.
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * Member account UIN supporting cross-account delivery, which can only be the delegated administrator. The default value is 0, indicating delivery to the administrator account.
    */
    @SerializedName("DeliverUin")
    @Expose
    private Long DeliverUin;

    /**
    * Valid values: 1 (configuration changes), 2 (resource list), and 3 (all).
    */
    @SerializedName("DeliverContentType")
    @Expose
    private Long DeliverContentType;

    /**
     * Get Valid values: 0 (disabled) and 1 (enabled). 
     * @return Status Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Valid values: 0 (disabled) and 1 (enabled).
     * @param Status Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Account group ID. 
     * @return AccountGroupId Account group ID.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID.
     * @param AccountGroupId Account group ID.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get Delivery service name 
     * @return DeliverName Delivery service name
     */
    public String getDeliverName() {
        return this.DeliverName;
    }

    /**
     * Set Delivery service name
     * @param DeliverName Delivery service name
     */
    public void setDeliverName(String DeliverName) {
        this.DeliverName = DeliverName;
    }

    /**
     * Get Six-segment resource format  
COS:qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId 
     * @return TargetArn Six-segment resource format  
COS:qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     */
    public String getTargetArn() {
        return this.TargetArn;
    }

    /**
     * Set Six-segment resource format  
COS:qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     * @param TargetArn Six-segment resource format  
COS:qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     */
    public void setTargetArn(String TargetArn) {
        this.TargetArn = TargetArn;
    }

    /**
     * Get Resource prefix. 
     * @return DeliverPrefix Resource prefix.
     */
    public String getDeliverPrefix() {
        return this.DeliverPrefix;
    }

    /**
     * Set Resource prefix.
     * @param DeliverPrefix Resource prefix.
     */
    public void setDeliverPrefix(String DeliverPrefix) {
        this.DeliverPrefix = DeliverPrefix;
    }

    /**
     * Get Delivery type. Valid value: COS and CLS. 
     * @return DeliverType Delivery type. Valid value: COS and CLS.
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set Delivery type. Valid value: COS and CLS.
     * @param DeliverType Delivery type. Valid value: COS and CLS.
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get Member account UIN supporting cross-account delivery, which can only be the delegated administrator. The default value is 0, indicating delivery to the administrator account. 
     * @return DeliverUin Member account UIN supporting cross-account delivery, which can only be the delegated administrator. The default value is 0, indicating delivery to the administrator account.
     */
    public Long getDeliverUin() {
        return this.DeliverUin;
    }

    /**
     * Set Member account UIN supporting cross-account delivery, which can only be the delegated administrator. The default value is 0, indicating delivery to the administrator account.
     * @param DeliverUin Member account UIN supporting cross-account delivery, which can only be the delegated administrator. The default value is 0, indicating delivery to the administrator account.
     */
    public void setDeliverUin(Long DeliverUin) {
        this.DeliverUin = DeliverUin;
    }

    /**
     * Get Valid values: 1 (configuration changes), 2 (resource list), and 3 (all). 
     * @return DeliverContentType Valid values: 1 (configuration changes), 2 (resource list), and 3 (all).
     */
    public Long getDeliverContentType() {
        return this.DeliverContentType;
    }

    /**
     * Set Valid values: 1 (configuration changes), 2 (resource list), and 3 (all).
     * @param DeliverContentType Valid values: 1 (configuration changes), 2 (resource list), and 3 (all).
     */
    public void setDeliverContentType(Long DeliverContentType) {
        this.DeliverContentType = DeliverContentType;
    }

    public UpdateAggregateConfigDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAggregateConfigDeliverRequest(UpdateAggregateConfigDeliverRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.DeliverName != null) {
            this.DeliverName = new String(source.DeliverName);
        }
        if (source.TargetArn != null) {
            this.TargetArn = new String(source.TargetArn);
        }
        if (source.DeliverPrefix != null) {
            this.DeliverPrefix = new String(source.DeliverPrefix);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverUin != null) {
            this.DeliverUin = new Long(source.DeliverUin);
        }
        if (source.DeliverContentType != null) {
            this.DeliverContentType = new Long(source.DeliverContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "DeliverName", this.DeliverName);
        this.setParamSimple(map, prefix + "TargetArn", this.TargetArn);
        this.setParamSimple(map, prefix + "DeliverPrefix", this.DeliverPrefix);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverUin", this.DeliverUin);
        this.setParamSimple(map, prefix + "DeliverContentType", this.DeliverContentType);

    }
}

