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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepDetail extends AbstractModel {

    /**
    * Detailed Steps Return Information
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Current Step Status, 0 Success, -2 Not Started
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Step Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Detailed Steps Return Information 
     * @return Msg Detailed Steps Return Information
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Detailed Steps Return Information
     * @param Msg Detailed Steps Return Information
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Current Step Status, 0 Success, -2 Not Started 
     * @return Status Current Step Status, 0 Success, -2 Not Started
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current Step Status, 0 Success, -2 Not Started
     * @param Status Current Step Status, 0 Success, -2 Not Started
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Step Name 
     * @return Name Step Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Step Name
     * @param Name Step Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public StepDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepDetail(StepDetail source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

