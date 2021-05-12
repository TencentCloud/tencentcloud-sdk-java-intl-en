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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionVersion extends AbstractModel{

    /**
    * Function version name
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version description
Note: This field may return null, indicating that no valid values is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The creation time
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
     * Get Function version name 
     * @return Version Function version name
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Function version name
     * @param Version Function version name
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version description
Note: This field may return null, indicating that no valid values is found. 
     * @return Description Version description
Note: This field may return null, indicating that no valid values is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description
Note: This field may return null, indicating that no valid values is found.
     * @param Description Version description
Note: This field may return null, indicating that no valid values is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The creation time
Note: This field may return null, indicating that no valid value was found. 
     * @return AddTime The creation time
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set The creation time
Note: This field may return null, indicating that no valid value was found.
     * @param AddTime The creation time
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid value was found. 
     * @return ModTime Update time
Note: This field may return null, indicating that no valid value was found.
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid value was found.
     * @param ModTime Update time
Note: This field may return null, indicating that no valid value was found.
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    public FunctionVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionVersion(FunctionVersion source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);

    }
}

