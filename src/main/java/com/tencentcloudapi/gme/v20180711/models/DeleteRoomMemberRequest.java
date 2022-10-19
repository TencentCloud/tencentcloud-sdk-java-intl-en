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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoomMemberRequest extends AbstractModel{

    /**
    * ID of the target room
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * List of the members to remove
    */
    @SerializedName("Uids")
    @Expose
    private String [] Uids;

    /**
    * Operation type. `1`: Delete a room; `2`: Remove members
    */
    @SerializedName("DeleteType")
    @Expose
    private Long DeleteType;

    /**
    * Application ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
     * Get ID of the target room 
     * @return RoomId ID of the target room
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set ID of the target room
     * @param RoomId ID of the target room
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get List of the members to remove 
     * @return Uids List of the members to remove
     */
    public String [] getUids() {
        return this.Uids;
    }

    /**
     * Set List of the members to remove
     * @param Uids List of the members to remove
     */
    public void setUids(String [] Uids) {
        this.Uids = Uids;
    }

    /**
     * Get Operation type. `1`: Delete a room; `2`: Remove members 
     * @return DeleteType Operation type. `1`: Delete a room; `2`: Remove members
     */
    public Long getDeleteType() {
        return this.DeleteType;
    }

    /**
     * Set Operation type. `1`: Delete a room; `2`: Remove members
     * @param DeleteType Operation type. `1`: Delete a room; `2`: Remove members
     */
    public void setDeleteType(Long DeleteType) {
        this.DeleteType = DeleteType;
    }

    /**
     * Get Application ID 
     * @return BizId Application ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID
     * @param BizId Application ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    public DeleteRoomMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoomMemberRequest(DeleteRoomMemberRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Uids != null) {
            this.Uids = new String[source.Uids.length];
            for (int i = 0; i < source.Uids.length; i++) {
                this.Uids[i] = new String(source.Uids[i]);
            }
        }
        if (source.DeleteType != null) {
            this.DeleteType = new Long(source.DeleteType);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArraySimple(map, prefix + "Uids.", this.Uids);
        this.setParamSimple(map, prefix + "DeleteType", this.DeleteType);
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

