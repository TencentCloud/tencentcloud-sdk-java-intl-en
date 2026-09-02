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

public class AIAgentCredentialLocation extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>Container ID</p>
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * <p>Credential path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Row number where the credential resides</p>
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * <p>Credential masking fragment</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Whether the credential is managed</p><p>Enumeration values:</p><ul><li>1: Managed</li><li>0: Unhosted</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Hosted credential ID</p>
    */
    @SerializedName("DelegateID")
    @Expose
    private Long DelegateID;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceID <p>Instance ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceID <p>Instance ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>Container ID</p> 
     * @return ContainerID <p>Container ID</p>
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set <p>Container ID</p>
     * @param ContainerID <p>Container ID</p>
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get <p>Credential path</p> 
     * @return Path <p>Credential path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Credential path</p>
     * @param Path <p>Credential path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Row number where the credential resides</p> 
     * @return Line <p>Row number where the credential resides</p>
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set <p>Row number where the credential resides</p>
     * @param Line <p>Row number where the credential resides</p>
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get <p>Credential masking fragment</p> 
     * @return Content <p>Credential masking fragment</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Credential masking fragment</p>
     * @param Content <p>Credential masking fragment</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Whether the credential is managed</p><p>Enumeration values:</p><ul><li>1: Managed</li><li>0: Unhosted</li></ul> 
     * @return Status <p>Whether the credential is managed</p><p>Enumeration values:</p><ul><li>1: Managed</li><li>0: Unhosted</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether the credential is managed</p><p>Enumeration values:</p><ul><li>1: Managed</li><li>0: Unhosted</li></ul>
     * @param Status <p>Whether the credential is managed</p><p>Enumeration values:</p><ul><li>1: Managed</li><li>0: Unhosted</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Hosted credential ID</p> 
     * @return DelegateID <p>Hosted credential ID</p>
     */
    public Long getDelegateID() {
        return this.DelegateID;
    }

    /**
     * Set <p>Hosted credential ID</p>
     * @param DelegateID <p>Hosted credential ID</p>
     */
    public void setDelegateID(Long DelegateID) {
        this.DelegateID = DelegateID;
    }

    public AIAgentCredentialLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentCredentialLocation(AIAgentCredentialLocation source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DelegateID != null) {
            this.DelegateID = new Long(source.DelegateID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DelegateID", this.DelegateID);

    }
}

