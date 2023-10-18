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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedImageInfo extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Number of associated servers
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Number of associated containers
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * List of components
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedImageComponentInfo [] ComponentList;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Number of associated servers 
     * @return HostCount Number of associated servers
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of associated servers
     * @param HostCount Number of associated servers
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Number of associated containers 
     * @return ContainerCount Number of associated containers
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Number of associated containers
     * @param ContainerCount Number of associated containers
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get List of components 
     * @return ComponentList List of components
     */
    public VulAffectedImageComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set List of components
     * @param ComponentList List of components
     */
    public void setComponentList(VulAffectedImageComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    public VulAffectedImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedImageInfo(VulAffectedImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedImageComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedImageComponentInfo(source.ComponentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);

    }
}

