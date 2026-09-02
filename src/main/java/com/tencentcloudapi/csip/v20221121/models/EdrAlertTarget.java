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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertTarget extends AbstractModel {

    /**
    * <p>Alarm primary key ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Alarm account ID (across different accounts, required by frontend)</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Alarm unique ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>Host UUID (Optional, returned from the list and passed through)</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Instance ID (optional, passed through from the list, used for tag enrichment in security center)</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Alarm sub-type</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
     * Get <p>Alarm primary key ID</p> 
     * @return Id <p>Alarm primary key ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Alarm primary key ID</p>
     * @param Id <p>Alarm primary key ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Alarm account ID (across different accounts, required by frontend)</p> 
     * @return AppId <p>Alarm account ID (across different accounts, required by frontend)</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Alarm account ID (across different accounts, required by frontend)</p>
     * @param AppId <p>Alarm account ID (across different accounts, required by frontend)</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Alarm unique ID</p> 
     * @return AlertId <p>Alarm unique ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>Alarm unique ID</p>
     * @param AlertId <p>Alarm unique ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>Host UUID (Optional, returned from the list and passed through)</p> 
     * @return Quuid <p>Host UUID (Optional, returned from the list and passed through)</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host UUID (Optional, returned from the list and passed through)</p>
     * @param Quuid <p>Host UUID (Optional, returned from the list and passed through)</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Instance ID (optional, passed through from the list, used for tag enrichment in security center)</p> 
     * @return InstanceId <p>Instance ID (optional, passed through from the list, used for tag enrichment in security center)</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID (optional, passed through from the list, used for tag enrichment in security center)</p>
     * @param InstanceId <p>Instance ID (optional, passed through from the list, used for tag enrichment in security center)</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Alarm sub-type</p> 
     * @return AlertSubType <p>Alarm sub-type</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>Alarm sub-type</p>
     * @param AlertSubType <p>Alarm sub-type</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    public EdrAlertTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertTarget(EdrAlertTarget source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);

    }
}

