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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserListItem extends AbstractModel {

    /**
    * User ID in the room.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The first time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The last time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get User ID in the room. 
     * @return UserId User ID in the room.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID in the room.
     * @param UserId User ID in the room.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The first time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds. 
     * @return StartTime The first time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The first time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     * @param StartTime The first time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The last time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds. 
     * @return EndTime The last time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The last time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     * @param EndTime The last time when the user ID appeared during the queried period, which is a Unix timestamp in milliseconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public UserListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserListItem(UserListItem source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

