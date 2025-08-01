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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get Application ID. 
     * @return BizId Application ID.
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID.
     * @param BizId Application ID.
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Room ID. 
     * @return RoomId Room ID.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID.
     * @param RoomId Room ID.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInfoRequest(DescribeTaskInfoRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

