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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomErrorPageRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Name of the file specified to be returned.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The custom page content, which is passed after being URL-encoded.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The subdomain name. 
     * @return Entity The subdomain name.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name.
     * @param Entity The subdomain name.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Name of the file specified to be returned. 
     * @return Name Name of the file specified to be returned.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the file specified to be returned.
     * @param Name Name of the file specified to be returned.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The custom page content, which is passed after being URL-encoded. 
     * @return Content The custom page content, which is passed after being URL-encoded.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The custom page content, which is passed after being URL-encoded.
     * @param Content The custom page content, which is passed after being URL-encoded.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateCustomErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomErrorPageRequest(CreateCustomErrorPageRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

