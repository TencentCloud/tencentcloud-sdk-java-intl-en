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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Interrupt extends AbstractModel {

    /**
    * User ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Number of video stream interruptions.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get User ID.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param UserId User ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Number of video stream interruptions.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Count Number of video stream interruptions.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of video stream interruptions.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Count Number of video stream interruptions.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Interrupt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Interrupt(Interrupt source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

