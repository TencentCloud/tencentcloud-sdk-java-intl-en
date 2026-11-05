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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppOperation extends AbstractModel {

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creator UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * Creator account (for private scenarios)
    */
    @SerializedName("CreatorUserAccount")
    @Expose
    private String CreatorUserAccount;

    /**
    * Last modified (Unix timestamp in seconds).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last modified by
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
    * Modifier UIN
    */
    @SerializedName("UpdaterUin")
    @Expose
    private String UpdaterUin;

    /**
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creator UIN 
     * @return CreatorUin Creator UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator UIN
     * @param CreatorUin Creator UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Creator account (for private scenarios) 
     * @return CreatorUserAccount Creator account (for private scenarios)
     */
    public String getCreatorUserAccount() {
        return this.CreatorUserAccount;
    }

    /**
     * Set Creator account (for private scenarios)
     * @param CreatorUserAccount Creator account (for private scenarios)
     */
    public void setCreatorUserAccount(String CreatorUserAccount) {
        this.CreatorUserAccount = CreatorUserAccount;
    }

    /**
     * Get Last modified (Unix timestamp in seconds). 
     * @return UpdateTime Last modified (Unix timestamp in seconds).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified (Unix timestamp in seconds).
     * @param UpdateTime Last modified (Unix timestamp in seconds).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last modified by 
     * @return Updater Last modified by
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set Last modified by
     * @param Updater Last modified by
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    /**
     * Get Modifier UIN 
     * @return UpdaterUin Modifier UIN
     */
    public String getUpdaterUin() {
        return this.UpdaterUin;
    }

    /**
     * Set Modifier UIN
     * @param UpdaterUin Modifier UIN
     */
    public void setUpdaterUin(String UpdaterUin) {
        this.UpdaterUin = UpdaterUin;
    }

    public AppOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppOperation(AppOperation source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreatorUserAccount != null) {
            this.CreatorUserAccount = new String(source.CreatorUserAccount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
        if (source.UpdaterUin != null) {
            this.UpdaterUin = new String(source.UpdaterUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreatorUserAccount", this.CreatorUserAccount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);
        this.setParamSimple(map, prefix + "UpdaterUin", this.UpdaterUin);

    }
}

