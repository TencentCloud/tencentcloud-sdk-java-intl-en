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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AreaCLSTargetInfo extends AbstractModel {

    /**
    * Logset region:
<li>ap-guangzhou: Guangzhou;</li>
<li>ap-beijing: Beijing;</li>
<li>ap-chengdu: Chengdu;</li>
<li>ap-chongqing: Chongqing.</li>
<li>ap-nanjing: Nanjing;</li>
<li>ap-shanghai: Shanghai;</li>
<li>ap-singapore: Singapore.</li>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * ID of the destination topic for delivery.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * ID of the target set for submission.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log delivery status.
ON: enabled.
OFF: disabled.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Logset region:
<li>ap-guangzhou: Guangzhou;</li>
<li>ap-beijing: Beijing;</li>
<li>ap-chengdu: Chengdu;</li>
<li>ap-chongqing: Chongqing.</li>
<li>ap-nanjing: Nanjing;</li>
<li>ap-shanghai: Shanghai;</li>
<li>ap-singapore: Singapore.</li> 
     * @return CLSRegion Logset region:
<li>ap-guangzhou: Guangzhou;</li>
<li>ap-beijing: Beijing;</li>
<li>ap-chengdu: Chengdu;</li>
<li>ap-chongqing: Chongqing.</li>
<li>ap-nanjing: Nanjing;</li>
<li>ap-shanghai: Shanghai;</li>
<li>ap-singapore: Singapore.</li>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set Logset region:
<li>ap-guangzhou: Guangzhou;</li>
<li>ap-beijing: Beijing;</li>
<li>ap-chengdu: Chengdu;</li>
<li>ap-chongqing: Chongqing.</li>
<li>ap-nanjing: Nanjing;</li>
<li>ap-shanghai: Shanghai;</li>
<li>ap-singapore: Singapore.</li>
     * @param CLSRegion Logset region:
<li>ap-guangzhou: Guangzhou;</li>
<li>ap-beijing: Beijing;</li>
<li>ap-chengdu: Chengdu;</li>
<li>ap-chongqing: Chongqing.</li>
<li>ap-nanjing: Nanjing;</li>
<li>ap-shanghai: Shanghai;</li>
<li>ap-singapore: Singapore.</li>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get ID of the destination topic for delivery. 
     * @return TopicId ID of the destination topic for delivery.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the destination topic for delivery.
     * @param TopicId ID of the destination topic for delivery.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get ID of the target set for submission. 
     * @return LogsetId ID of the target set for submission.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set ID of the target set for submission.
     * @param LogsetId ID of the target set for submission.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log delivery status.
ON: enabled.
OFF: disabled. 
     * @return Switch Log delivery status.
ON: enabled.
OFF: disabled.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Log delivery status.
ON: enabled.
OFF: disabled.
     * @param Switch Log delivery status.
ON: enabled.
OFF: disabled.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public AreaCLSTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AreaCLSTargetInfo(AreaCLSTargetInfo source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

