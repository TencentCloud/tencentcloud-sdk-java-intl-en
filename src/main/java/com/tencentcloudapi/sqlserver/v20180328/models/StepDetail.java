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
    * 
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get  
     * @return Msg 
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 
     * @param Msg 
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
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

