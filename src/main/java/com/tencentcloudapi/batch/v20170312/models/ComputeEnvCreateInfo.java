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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeEnvCreateInfo extends AbstractModel {

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Compute environment name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * Compute environment description
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * Compute environment type. Only "MANAGED" type is supported
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Compute environment parameter
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * Data disk mounting option
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * Input mapping
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * Authorization information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * Notification information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Notifications")
    @Expose
    private Notification [] Notifications;

    /**
    * Number of desired compute nodes
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * Tag list of the compute environment.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Compute environment name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EnvName Compute environment name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set Compute environment name
Note: This field may return `null`, indicating that no valid value was found.
     * @param EnvName Compute environment name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get Compute environment description
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EnvDescription Compute environment description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * Set Compute environment description
Note: This field may return `null`, indicating that no valid value was found.
     * @param EnvDescription Compute environment description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * Get Compute environment type. Only "MANAGED" type is supported 
     * @return EnvType Compute environment type. Only "MANAGED" type is supported
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Compute environment type. Only "MANAGED" type is supported
     * @param EnvType Compute environment type. Only "MANAGED" type is supported
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Compute environment parameter 
     * @return EnvData Compute environment parameter
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set Compute environment parameter
     * @param EnvData Compute environment parameter
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * Get Data disk mounting option
Note: This field may return `null`, indicating that no valid value was found. 
     * @return MountDataDisks Data disk mounting option
Note: This field may return `null`, indicating that no valid value was found.
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * Set Data disk mounting option
Note: This field may return `null`, indicating that no valid value was found.
     * @param MountDataDisks Data disk mounting option
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * Get Input mapping
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InputMappings Input mapping
Note: This field may return `null`, indicating that no valid value was found.
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set Input mapping
Note: This field may return `null`, indicating that no valid value was found.
     * @param InputMappings Input mapping
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get Authorization information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Authentications Authorization information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set Authorization information
Note: This field may return `null`, indicating that no valid value was found.
     * @param Authentications Authorization information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get Notification information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Notifications Notification information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Notification [] getNotifications() {
        return this.Notifications;
    }

    /**
     * Set Notification information
Note: This field may return `null`, indicating that no valid value was found.
     * @param Notifications Notification information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNotifications(Notification [] Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get Number of desired compute nodes 
     * @return DesiredComputeNodeCount Number of desired compute nodes
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set Number of desired compute nodes
     * @param DesiredComputeNodeCount Number of desired compute nodes
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get Tag list of the compute environment.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag list of the compute environment.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list of the compute environment.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag list of the compute environment.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ComputeEnvCreateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeEnvCreateInfo(ComputeEnvCreateInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnvName != null) {
            this.EnvName = new String(source.EnvName);
        }
        if (source.EnvDescription != null) {
            this.EnvDescription = new String(source.EnvDescription);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.EnvData != null) {
            this.EnvData = new EnvData(source.EnvData);
        }
        if (source.MountDataDisks != null) {
            this.MountDataDisks = new MountDataDisk[source.MountDataDisks.length];
            for (int i = 0; i < source.MountDataDisks.length; i++) {
                this.MountDataDisks[i] = new MountDataDisk(source.MountDataDisks[i]);
            }
        }
        if (source.InputMappings != null) {
            this.InputMappings = new InputMapping[source.InputMappings.length];
            for (int i = 0; i < source.InputMappings.length; i++) {
                this.InputMappings[i] = new InputMapping(source.InputMappings[i]);
            }
        }
        if (source.Authentications != null) {
            this.Authentications = new Authentication[source.Authentications.length];
            for (int i = 0; i < source.Authentications.length; i++) {
                this.Authentications[i] = new Authentication(source.Authentications[i]);
            }
        }
        if (source.Notifications != null) {
            this.Notifications = new Notification[source.Notifications.length];
            for (int i = 0; i < source.Notifications.length; i++) {
                this.Notifications[i] = new Notification(source.Notifications[i]);
            }
        }
        if (source.DesiredComputeNodeCount != null) {
            this.DesiredComputeNodeCount = new Long(source.DesiredComputeNodeCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamArrayObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

