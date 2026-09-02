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

public class VulAffectedComponent extends AbstractModel {

    /**
    * <p>Component id</p>
    */
    @SerializedName("ComponentId")
    @Expose
    private Long ComponentId;

    /**
    * <p>Image layer id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>Component name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Component version number</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Version number of the vulnerability fix</p>
    */
    @SerializedName("FixedVersion")
    @Expose
    private String FixedVersion;

    /**
     * Get <p>Component id</p> 
     * @return ComponentId <p>Component id</p>
     */
    public Long getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set <p>Component id</p>
     * @param ComponentId <p>Component id</p>
     */
    public void setComponentId(Long ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get <p>Image layer id</p> 
     * @return LayerId <p>Image layer id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>Image layer id</p>
     * @param LayerId <p>Image layer id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>Component name</p> 
     * @return Name <p>Component name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Component name</p>
     * @param Name <p>Component name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Component version number</p> 
     * @return Version <p>Component version number</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Component version number</p>
     * @param Version <p>Component version number</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Version number of the vulnerability fix</p> 
     * @return FixedVersion <p>Version number of the vulnerability fix</p>
     */
    public String getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set <p>Version number of the vulnerability fix</p>
     * @param FixedVersion <p>Version number of the vulnerability fix</p>
     */
    public void setFixedVersion(String FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    public VulAffectedComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedComponent(VulAffectedComponent source) {
        if (source.ComponentId != null) {
            this.ComponentId = new Long(source.ComponentId);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FixedVersion != null) {
            this.FixedVersion = new String(source.FixedVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixedVersion", this.FixedVersion);

    }
}

