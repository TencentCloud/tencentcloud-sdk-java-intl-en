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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateHostLoginWhiteObj extends AbstractModel {

    /**
    * Region information array
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * Source IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Data ID to be updated
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Region information array 
     * @return Places Region information array
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Region information array
     * @param Places Region information array
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * Get Source IP 
     * @return SrcIp Source IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP
     * @param SrcIp Source IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Data ID to be updated 
     * @return Id Data ID to be updated
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Data ID to be updated
     * @param Id Data ID to be updated
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public UpdateHostLoginWhiteObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateHostLoginWhiteObj(UpdateHostLoginWhiteObj source) {
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

