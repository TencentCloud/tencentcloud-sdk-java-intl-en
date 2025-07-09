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

public class AbnormalEvent extends AbstractModel {

    /**
    * The error event ID. For details, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
    */
    @SerializedName("AbnormalEventId")
    @Expose
    private Long AbnormalEventId;

    /**
    * The remote user ID. If this parameter is empty, it indicates that the error event is not associated with a remote user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
     * Get The error event ID. For details, see https://www.tencentcloud.com/document/product/647/37906?has_map=1 
     * @return AbnormalEventId The error event ID. For details, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     */
    public Long getAbnormalEventId() {
        return this.AbnormalEventId;
    }

    /**
     * Set The error event ID. For details, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     * @param AbnormalEventId The error event ID. For details, see https://www.tencentcloud.com/document/product/647/37906?has_map=1
     */
    public void setAbnormalEventId(Long AbnormalEventId) {
        this.AbnormalEventId = AbnormalEventId;
    }

    /**
     * Get The remote user ID. If this parameter is empty, it indicates that the error event is not associated with a remote user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeerId The remote user ID. If this parameter is empty, it indicates that the error event is not associated with a remote user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set The remote user ID. If this parameter is empty, it indicates that the error event is not associated with a remote user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeerId The remote user ID. If this parameter is empty, it indicates that the error event is not associated with a remote user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    public AbnormalEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalEvent(AbnormalEvent source) {
        if (source.AbnormalEventId != null) {
            this.AbnormalEventId = new Long(source.AbnormalEventId);
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AbnormalEventId", this.AbnormalEventId);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);

    }
}

