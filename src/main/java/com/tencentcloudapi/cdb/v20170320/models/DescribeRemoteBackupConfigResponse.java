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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRemoteBackupConfigResponse extends AbstractModel{

    /**
    * Remote backup retention period in days
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
    * Remote data backup. Valid values:`off` (disable), `on` (enable).
    */
    @SerializedName("RemoteBackupSave")
    @Expose
    private String RemoteBackupSave;

    /**
    * Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
    */
    @SerializedName("RemoteBinlogSave")
    @Expose
    private String RemoteBinlogSave;

    /**
    * List of configured remote backup regions
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String [] RemoteRegion;

    /**
    * List of remote backup regions
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Remote backup retention period in days 
     * @return ExpireDays Remote backup retention period in days
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set Remote backup retention period in days
     * @param ExpireDays Remote backup retention period in days
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    /**
     * Get Remote data backup. Valid values:`off` (disable), `on` (enable). 
     * @return RemoteBackupSave Remote data backup. Valid values:`off` (disable), `on` (enable).
     */
    public String getRemoteBackupSave() {
        return this.RemoteBackupSave;
    }

    /**
     * Set Remote data backup. Valid values:`off` (disable), `on` (enable).
     * @param RemoteBackupSave Remote data backup. Valid values:`off` (disable), `on` (enable).
     */
    public void setRemoteBackupSave(String RemoteBackupSave) {
        this.RemoteBackupSave = RemoteBackupSave;
    }

    /**
     * Get Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`. 
     * @return RemoteBinlogSave Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     */
    public String getRemoteBinlogSave() {
        return this.RemoteBinlogSave;
    }

    /**
     * Set Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     * @param RemoteBinlogSave Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     */
    public void setRemoteBinlogSave(String RemoteBinlogSave) {
        this.RemoteBinlogSave = RemoteBinlogSave;
    }

    /**
     * Get List of configured remote backup regions 
     * @return RemoteRegion List of configured remote backup regions
     */
    public String [] getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set List of configured remote backup regions
     * @param RemoteRegion List of configured remote backup regions
     */
    public void setRemoteRegion(String [] RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    /**
     * Get List of remote backup regions 
     * @return RegionList List of remote backup regions
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set List of remote backup regions
     * @param RegionList List of remote backup regions
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRemoteBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRemoteBackupConfigResponse(DescribeRemoteBackupConfigResponse source) {
        if (source.ExpireDays != null) {
            this.ExpireDays = new Long(source.ExpireDays);
        }
        if (source.RemoteBackupSave != null) {
            this.RemoteBackupSave = new String(source.RemoteBackupSave);
        }
        if (source.RemoteBinlogSave != null) {
            this.RemoteBinlogSave = new String(source.RemoteBinlogSave);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String[source.RemoteRegion.length];
            for (int i = 0; i < source.RemoteRegion.length; i++) {
                this.RemoteRegion[i] = new String(source.RemoteRegion[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);
        this.setParamSimple(map, prefix + "RemoteBackupSave", this.RemoteBackupSave);
        this.setParamSimple(map, prefix + "RemoteBinlogSave", this.RemoteBinlogSave);
        this.setParamArraySimple(map, prefix + "RemoteRegion.", this.RemoteRegion);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

