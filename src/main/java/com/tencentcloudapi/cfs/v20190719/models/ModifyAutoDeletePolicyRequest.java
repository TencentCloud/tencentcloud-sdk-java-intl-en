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

public class ModifyAutoDeletePolicyRequest extends AbstractModel {

    /**
    * <p>File system ID.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Automatic cleanup policy ID.</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>List of automatic cleanup paths.</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * <p>Automatic cleanup policy name.</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>Policy status.</p><p>Valid values:</p><ul><li>enabled: Enabled.</li><li>disabled: Disabled.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>File system ID.</p> 
     * @return FileSystemId <p>File system ID.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID.</p>
     * @param FileSystemId <p>File system ID.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Automatic cleanup policy ID.</p> 
     * @return PolicyId <p>Automatic cleanup policy ID.</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>Automatic cleanup policy ID.</p>
     * @param PolicyId <p>Automatic cleanup policy ID.</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>List of automatic cleanup paths.</p> 
     * @return Paths <p>List of automatic cleanup paths.</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>List of automatic cleanup paths.</p>
     * @param Paths <p>List of automatic cleanup paths.</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
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
     * Get <p>Policy status.</p><p>Valid values:</p><ul><li>enabled: Enabled.</li><li>disabled: Disabled.</li></ul> 
     * @return Status <p>Policy status.</p><p>Valid values:</p><ul><li>enabled: Enabled.</li><li>disabled: Disabled.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Policy status.</p><p>Valid values:</p><ul><li>enabled: Enabled.</li><li>disabled: Disabled.</li></ul>
     * @param Status <p>Policy status.</p><p>Valid values:</p><ul><li>enabled: Enabled.</li><li>disabled: Disabled.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyAutoDeletePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoDeletePolicyRequest(ModifyAutoDeletePolicyRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

