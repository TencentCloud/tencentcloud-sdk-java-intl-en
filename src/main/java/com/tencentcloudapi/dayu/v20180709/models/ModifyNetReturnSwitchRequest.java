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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetReturnSwitchRequest extends AbstractModel {

    /**
    * Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Switch status. 0: disabled, 1: enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Switch duration in hours. Valid values: [0,1,2,3,4,5,6;]. If `status` is 1, this field is required and must be greater than 0
    */
    @SerializedName("Hour")
    @Expose
    private Long Hour;

    /**
     * Get Anti-DDoS service type (`net`: Anti-DDoS Ultimate) 
     * @return Business Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     * @param Business Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Switch status. 0: disabled, 1: enabled 
     * @return Status Switch status. 0: disabled, 1: enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Switch status. 0: disabled, 1: enabled
     * @param Status Switch status. 0: disabled, 1: enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Switch duration in hours. Valid values: [0,1,2,3,4,5,6;]. If `status` is 1, this field is required and must be greater than 0 
     * @return Hour Switch duration in hours. Valid values: [0,1,2,3,4,5,6;]. If `status` is 1, this field is required and must be greater than 0
     */
    public Long getHour() {
        return this.Hour;
    }

    /**
     * Set Switch duration in hours. Valid values: [0,1,2,3,4,5,6;]. If `status` is 1, this field is required and must be greater than 0
     * @param Hour Switch duration in hours. Valid values: [0,1,2,3,4,5,6;]. If `status` is 1, this field is required and must be greater than 0
     */
    public void setHour(Long Hour) {
        this.Hour = Hour;
    }

    public ModifyNetReturnSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetReturnSwitchRequest(ModifyNetReturnSwitchRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Hour != null) {
            this.Hour = new Long(source.Hour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Hour", this.Hour);

    }
}

