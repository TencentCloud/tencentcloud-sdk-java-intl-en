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

public class ScanCSIPTaskAgainRequest extends AbstractModel {

    /**
    * <p>Scan task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Limit the target host list for this rescan. If it is empty, all instance IDs in the sub-table corresponding to the primary table are used. Maximum length: 1000</p>
    */
    @SerializedName("InstanceIDList")
    @Expose
    private String [] InstanceIDList;

    /**
    * <p>Scan timeout duration (seconds). Optional. If it is not zero, update the one-click scan timeout configuration and synchronously update the timeout field in the sub-table. The cap is 7200 seconds (2 hours). If it is exceeded, InvalidParameter is returned.</p>
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
     * Get <p>Scan task ID.</p> 
     * @return TaskId <p>Scan task ID.</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Scan task ID.</p>
     * @param TaskId <p>Scan task ID.</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Limit the target host list for this rescan. If it is empty, all instance IDs in the sub-table corresponding to the primary table are used. Maximum length: 1000</p> 
     * @return InstanceIDList <p>Limit the target host list for this rescan. If it is empty, all instance IDs in the sub-table corresponding to the primary table are used. Maximum length: 1000</p>
     */
    public String [] getInstanceIDList() {
        return this.InstanceIDList;
    }

    /**
     * Set <p>Limit the target host list for this rescan. If it is empty, all instance IDs in the sub-table corresponding to the primary table are used. Maximum length: 1000</p>
     * @param InstanceIDList <p>Limit the target host list for this rescan. If it is empty, all instance IDs in the sub-table corresponding to the primary table are used. Maximum length: 1000</p>
     */
    public void setInstanceIDList(String [] InstanceIDList) {
        this.InstanceIDList = InstanceIDList;
    }

    /**
     * Get <p>Scan timeout duration (seconds). Optional. If it is not zero, update the one-click scan timeout configuration and synchronously update the timeout field in the sub-table. The cap is 7200 seconds (2 hours). If it is exceeded, InvalidParameter is returned.</p> 
     * @return TimeoutPeriod <p>Scan timeout duration (seconds). Optional. If it is not zero, update the one-click scan timeout configuration and synchronously update the timeout field in the sub-table. The cap is 7200 seconds (2 hours). If it is exceeded, InvalidParameter is returned.</p>
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set <p>Scan timeout duration (seconds). Optional. If it is not zero, update the one-click scan timeout configuration and synchronously update the timeout field in the sub-table. The cap is 7200 seconds (2 hours). If it is exceeded, InvalidParameter is returned.</p>
     * @param TimeoutPeriod <p>Scan timeout duration (seconds). Optional. If it is not zero, update the one-click scan timeout configuration and synchronously update the timeout field in the sub-table. The cap is 7200 seconds (2 hours). If it is exceeded, InvalidParameter is returned.</p>
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    public ScanCSIPTaskAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanCSIPTaskAgainRequest(ScanCSIPTaskAgainRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIDList != null) {
            this.InstanceIDList = new String[source.InstanceIDList.length];
            for (int i = 0; i < source.InstanceIDList.length; i++) {
                this.InstanceIDList[i] = new String(source.InstanceIDList[i]);
            }
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIDList.", this.InstanceIDList);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);

    }
}

