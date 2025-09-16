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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Container extends AbstractModel {

    /**
    * Name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Image address.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Container status.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private ContainerStatus Status;

    /**
     * Get Name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerId id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerId id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Image address.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Image Image address.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Image address.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Image Image address.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Container status.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Container status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ContainerStatus getStatus() {
        return this.Status;
    }

    /**
     * Set Container status.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Container status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(ContainerStatus Status) {
        this.Status = Status;
    }

    public Container() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Container(Container source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Status != null) {
            this.Status = new ContainerStatus(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamObj(map, prefix + "Status.", this.Status);

    }
}

