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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartOptimizerPolicy extends AbstractModel {

    /**
    * Whether to inherit it
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Inherit")
    @Expose
    private String Inherit;

    /**
    * ResourceInfo
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * SmartOptimizerWrittenPolicy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Written")
    @Expose
    private SmartOptimizerWrittenPolicy Written;

    /**
    * SmartOptimizerLifecyclePolicy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Lifecycle")
    @Expose
    private SmartOptimizerLifecyclePolicy Lifecycle;

    /**
    * SmartOptimizerIndexPolicy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Index")
    @Expose
    private SmartOptimizerIndexPolicy Index;

    /**
     * Get Whether to inherit it
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Inherit Whether to inherit it
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInherit() {
        return this.Inherit;
    }

    /**
     * Set Whether to inherit it
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Inherit Whether to inherit it
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInherit(String Inherit) {
        this.Inherit = Inherit;
    }

    /**
     * Get ResourceInfo
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resources ResourceInfo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set ResourceInfo
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resources ResourceInfo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get SmartOptimizerWrittenPolicy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Written SmartOptimizerWrittenPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartOptimizerWrittenPolicy getWritten() {
        return this.Written;
    }

    /**
     * Set SmartOptimizerWrittenPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Written SmartOptimizerWrittenPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWritten(SmartOptimizerWrittenPolicy Written) {
        this.Written = Written;
    }

    /**
     * Get SmartOptimizerLifecyclePolicy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Lifecycle SmartOptimizerLifecyclePolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartOptimizerLifecyclePolicy getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set SmartOptimizerLifecyclePolicy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Lifecycle SmartOptimizerLifecyclePolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifecycle(SmartOptimizerLifecyclePolicy Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get SmartOptimizerIndexPolicy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Index SmartOptimizerIndexPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartOptimizerIndexPolicy getIndex() {
        return this.Index;
    }

    /**
     * Set SmartOptimizerIndexPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Index SmartOptimizerIndexPolicy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndex(SmartOptimizerIndexPolicy Index) {
        this.Index = Index;
    }

    public SmartOptimizerPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartOptimizerPolicy(SmartOptimizerPolicy source) {
        if (source.Inherit != null) {
            this.Inherit = new String(source.Inherit);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceInfo(source.Resources[i]);
            }
        }
        if (source.Written != null) {
            this.Written = new SmartOptimizerWrittenPolicy(source.Written);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new SmartOptimizerLifecyclePolicy(source.Lifecycle);
        }
        if (source.Index != null) {
            this.Index = new SmartOptimizerIndexPolicy(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Inherit", this.Inherit);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "Written.", this.Written);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Index.", this.Index);

    }
}

