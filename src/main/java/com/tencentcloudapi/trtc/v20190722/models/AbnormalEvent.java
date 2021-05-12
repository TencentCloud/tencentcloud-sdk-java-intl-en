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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalEvent extends AbstractModel{

    /**
    * Exception event ID. For specific values, please see Appendix. Exceptional Experience ID Mapping Table.
    */
    @SerializedName("AbnormalEventId")
    @Expose
    private Long AbnormalEventId;

    /**
    * Remote user ID. If this parameter is left empty, it indicates that the exception event is not caused by the remote user.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
     * Get Exception event ID. For specific values, please see Appendix. Exceptional Experience ID Mapping Table. 
     * @return AbnormalEventId Exception event ID. For specific values, please see Appendix. Exceptional Experience ID Mapping Table.
     */
    public Long getAbnormalEventId() {
        return this.AbnormalEventId;
    }

    /**
     * Set Exception event ID. For specific values, please see Appendix. Exceptional Experience ID Mapping Table.
     * @param AbnormalEventId Exception event ID. For specific values, please see Appendix. Exceptional Experience ID Mapping Table.
     */
    public void setAbnormalEventId(Long AbnormalEventId) {
        this.AbnormalEventId = AbnormalEventId;
    }

    /**
     * Get Remote user ID. If this parameter is left empty, it indicates that the exception event is not caused by the remote user.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PeerId Remote user ID. If this parameter is left empty, it indicates that the exception event is not caused by the remote user.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set Remote user ID. If this parameter is left empty, it indicates that the exception event is not caused by the remote user.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PeerId Remote user ID. If this parameter is left empty, it indicates that the exception event is not caused by the remote user.
Note: this field may return null, indicating that no valid values can be obtained.
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

