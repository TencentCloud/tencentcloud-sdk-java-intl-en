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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoDeletePolicy extends AbstractModel {

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>File system Id.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Automatic cleanup policy name.</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>Path to be cleaned up.</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * <p>Automatic cleanup policy status.</p><p>Enumeration values:</p><ul><li>enabling: Enabling</li><li>enabled: Enabled</li><li>disabling: Disabling</li><li>disabed: Disabled</li><li>deleting: Deleting</li><li>failed: Failed</li><li>creating: Creating</li><li>updating: Updating</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Cleanup policy creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Policy update time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Region to which the policy belongs.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Error information.</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>Policy ID.</p> 
     * @return PolicyId <p>Policy ID.</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param PolicyId <p>Policy ID.</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>File system Id.</p> 
     * @return FileSystemId <p>File system Id.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system Id.</p>
     * @param FileSystemId <p>File system Id.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Automatic cleanup policy name.</p> 
     * @return PolicyName <p>Automatic cleanup policy name.</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>Automatic cleanup policy name.</p>
     * @param PolicyName <p>Automatic cleanup policy name.</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>Path to be cleaned up.</p> 
     * @return Paths <p>Path to be cleaned up.</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>Path to be cleaned up.</p>
     * @param Paths <p>Path to be cleaned up.</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get <p>Automatic cleanup policy status.</p><p>Enumeration values:</p><ul><li>enabling: Enabling</li><li>enabled: Enabled</li><li>disabling: Disabling</li><li>disabed: Disabled</li><li>deleting: Deleting</li><li>failed: Failed</li><li>creating: Creating</li><li>updating: Updating</li></ul> 
     * @return Status <p>Automatic cleanup policy status.</p><p>Enumeration values:</p><ul><li>enabling: Enabling</li><li>enabled: Enabled</li><li>disabling: Disabling</li><li>disabed: Disabled</li><li>deleting: Deleting</li><li>failed: Failed</li><li>creating: Creating</li><li>updating: Updating</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Automatic cleanup policy status.</p><p>Enumeration values:</p><ul><li>enabling: Enabling</li><li>enabled: Enabled</li><li>disabling: Disabling</li><li>disabed: Disabled</li><li>deleting: Deleting</li><li>failed: Failed</li><li>creating: Creating</li><li>updating: Updating</li></ul>
     * @param Status <p>Automatic cleanup policy status.</p><p>Enumeration values:</p><ul><li>enabling: Enabling</li><li>enabled: Enabled</li><li>disabling: Disabling</li><li>disabed: Disabled</li><li>deleting: Deleting</li><li>failed: Failed</li><li>creating: Creating</li><li>updating: Updating</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Cleanup policy creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>Cleanup policy creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Cleanup policy creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>Cleanup policy creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Policy update time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>Policy update time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Policy update time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>Policy update time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Region to which the policy belongs.</p> 
     * @return Region <p>Region to which the policy belongs.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region to which the policy belongs.</p>
     * @param Region <p>Region to which the policy belongs.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Error information.</p> 
     * @return ErrMsg <p>Error information.</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error information.</p>
     * @param ErrMsg <p>Error information.</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public AutoDeletePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoDeletePolicy(AutoDeletePolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

