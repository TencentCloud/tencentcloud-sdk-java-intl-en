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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogUser extends AbstractModel {

    /**
    * Source username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Percentage of the number of slow logs from this source username to the total number of slow logs
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * Number of slow logs from this source username
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Source username 
     * @return UserName Source username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Source username
     * @param UserName Source username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Percentage of the number of slow logs from this source username to the total number of slow logs 
     * @return Ratio Percentage of the number of slow logs from this source username to the total number of slow logs
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set Percentage of the number of slow logs from this source username to the total number of slow logs
     * @param Ratio Percentage of the number of slow logs from this source username to the total number of slow logs
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get Number of slow logs from this source username 
     * @return Count Number of slow logs from this source username
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of slow logs from this source username
     * @param Count Number of slow logs from this source username
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public SlowLogUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogUser(SlowLogUser source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

