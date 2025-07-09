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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuPassThrough extends AbstractModel {

    /**
    * The payload of the pass-through SEI.
    */
    @SerializedName("PayloadContent")
    @Expose
    private String PayloadContent;

    /**
    * The payload type of the SEI message. Value range: 5 and 100-254 (244 is used internally by Tencent Cloud for timestamps).
    */
    @SerializedName("PayloadType")
    @Expose
    private Long PayloadType;

    /**
    * This parameter is required only if `PayloadType` is 5. It must be a 32-character hexadecimal string. If `PayloadType` is not 5, this parameter will be ignored.
    */
    @SerializedName("PayloadUuid")
    @Expose
    private String PayloadUuid;

    /**
    * The SEI sending interval (milliseconds). The default value is 1000.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Valid values: `1`: SEI is guaranteed when keyframes are sent; `0` (default): SEI is not guaranteed when keyframes are sent.
    */
    @SerializedName("FollowIdr")
    @Expose
    private Long FollowIdr;

    /**
     * Get The payload of the pass-through SEI. 
     * @return PayloadContent The payload of the pass-through SEI.
     */
    public String getPayloadContent() {
        return this.PayloadContent;
    }

    /**
     * Set The payload of the pass-through SEI.
     * @param PayloadContent The payload of the pass-through SEI.
     */
    public void setPayloadContent(String PayloadContent) {
        this.PayloadContent = PayloadContent;
    }

    /**
     * Get The payload type of the SEI message. Value range: 5 and 100-254 (244 is used internally by Tencent Cloud for timestamps). 
     * @return PayloadType The payload type of the SEI message. Value range: 5 and 100-254 (244 is used internally by Tencent Cloud for timestamps).
     */
    public Long getPayloadType() {
        return this.PayloadType;
    }

    /**
     * Set The payload type of the SEI message. Value range: 5 and 100-254 (244 is used internally by Tencent Cloud for timestamps).
     * @param PayloadType The payload type of the SEI message. Value range: 5 and 100-254 (244 is used internally by Tencent Cloud for timestamps).
     */
    public void setPayloadType(Long PayloadType) {
        this.PayloadType = PayloadType;
    }

    /**
     * Get This parameter is required only if `PayloadType` is 5. It must be a 32-character hexadecimal string. If `PayloadType` is not 5, this parameter will be ignored. 
     * @return PayloadUuid This parameter is required only if `PayloadType` is 5. It must be a 32-character hexadecimal string. If `PayloadType` is not 5, this parameter will be ignored.
     */
    public String getPayloadUuid() {
        return this.PayloadUuid;
    }

    /**
     * Set This parameter is required only if `PayloadType` is 5. It must be a 32-character hexadecimal string. If `PayloadType` is not 5, this parameter will be ignored.
     * @param PayloadUuid This parameter is required only if `PayloadType` is 5. It must be a 32-character hexadecimal string. If `PayloadType` is not 5, this parameter will be ignored.
     */
    public void setPayloadUuid(String PayloadUuid) {
        this.PayloadUuid = PayloadUuid;
    }

    /**
     * Get The SEI sending interval (milliseconds). The default value is 1000. 
     * @return Interval The SEI sending interval (milliseconds). The default value is 1000.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set The SEI sending interval (milliseconds). The default value is 1000.
     * @param Interval The SEI sending interval (milliseconds). The default value is 1000.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Valid values: `1`: SEI is guaranteed when keyframes are sent; `0` (default): SEI is not guaranteed when keyframes are sent. 
     * @return FollowIdr Valid values: `1`: SEI is guaranteed when keyframes are sent; `0` (default): SEI is not guaranteed when keyframes are sent.
     */
    public Long getFollowIdr() {
        return this.FollowIdr;
    }

    /**
     * Set Valid values: `1`: SEI is guaranteed when keyframes are sent; `0` (default): SEI is not guaranteed when keyframes are sent.
     * @param FollowIdr Valid values: `1`: SEI is guaranteed when keyframes are sent; `0` (default): SEI is not guaranteed when keyframes are sent.
     */
    public void setFollowIdr(Long FollowIdr) {
        this.FollowIdr = FollowIdr;
    }

    public McuPassThrough() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuPassThrough(McuPassThrough source) {
        if (source.PayloadContent != null) {
            this.PayloadContent = new String(source.PayloadContent);
        }
        if (source.PayloadType != null) {
            this.PayloadType = new Long(source.PayloadType);
        }
        if (source.PayloadUuid != null) {
            this.PayloadUuid = new String(source.PayloadUuid);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.FollowIdr != null) {
            this.FollowIdr = new Long(source.FollowIdr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayloadContent", this.PayloadContent);
        this.setParamSimple(map, prefix + "PayloadType", this.PayloadType);
        this.setParamSimple(map, prefix + "PayloadUuid", this.PayloadUuid);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FollowIdr", this.FollowIdr);

    }
}

