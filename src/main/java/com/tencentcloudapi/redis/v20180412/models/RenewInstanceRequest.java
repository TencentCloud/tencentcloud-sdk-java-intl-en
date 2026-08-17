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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel {

    /**
    * Purchase duration.
-Unit: month.
- Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list) and copy it from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Flag whether to change billing mode.
-The billing mode of the current instance is pay-as-you-go. To convert to yearly/monthly subscription and renew, specify this parameter as <b>prepaid</b>.
-The current instance billing mode is yearly/monthly subscription, so this parameter can be left unset.
    */
    @SerializedName("ModifyPayMode")
    @Expose
    private String ModifyPayMode;

    /**
     * Get Purchase duration.
-Unit: month.
- Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. 
     * @return Period Purchase duration.
-Unit: month.
- Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration.
-Unit: month.
- Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.
     * @param Period Purchase duration.
-Unit: month.
- Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list) and copy it from the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list) and copy it from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list) and copy it from the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list) and copy it from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Flag whether to change billing mode.
-The billing mode of the current instance is pay-as-you-go. To convert to yearly/monthly subscription and renew, specify this parameter as <b>prepaid</b>.
-The current instance billing mode is yearly/monthly subscription, so this parameter can be left unset. 
     * @return ModifyPayMode Flag whether to change billing mode.
-The billing mode of the current instance is pay-as-you-go. To convert to yearly/monthly subscription and renew, specify this parameter as <b>prepaid</b>.
-The current instance billing mode is yearly/monthly subscription, so this parameter can be left unset.
     */
    public String getModifyPayMode() {
        return this.ModifyPayMode;
    }

    /**
     * Set Flag whether to change billing mode.
-The billing mode of the current instance is pay-as-you-go. To convert to yearly/monthly subscription and renew, specify this parameter as <b>prepaid</b>.
-The current instance billing mode is yearly/monthly subscription, so this parameter can be left unset.
     * @param ModifyPayMode Flag whether to change billing mode.
-The billing mode of the current instance is pay-as-you-go. To convert to yearly/monthly subscription and renew, specify this parameter as <b>prepaid</b>.
-The current instance billing mode is yearly/monthly subscription, so this parameter can be left unset.
     */
    public void setModifyPayMode(String ModifyPayMode) {
        this.ModifyPayMode = ModifyPayMode;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyPayMode != null) {
            this.ModifyPayMode = new String(source.ModifyPayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ModifyPayMode", this.ModifyPayMode);

    }
}

