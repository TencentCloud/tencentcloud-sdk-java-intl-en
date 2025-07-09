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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceBaseInfo extends AbstractModel {

    /**
    * If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseNames")
    @Expose
    private String [] DatabaseNames;

    /**
    * Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Data Source ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * Data Source Name, cannot be empty under the same SpaceName
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Version information of the data source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Attached parameter information of the data source Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParamsString")
    @Expose
    private String ParamsString;

    /**
    * Distinguish whether the data source type is a custom Definition source or a system source
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseNames If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getDatabaseNames() {
        return this.DatabaseNames;
    }

    /**
     * Set If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseNames If the data source list is bound to a database, then it is the database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseNames(String [] DatabaseNames) {
        this.DatabaseNames = DatabaseNames;
    }

    /**
     * Get Data source description informationNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Data source description informationNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Data Source ID 
     * @return ID Data Source ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Data Source ID
     * @param ID Data Source ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param Instance Instance ID of the data source engine, e.g., CDB Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get Data Source Name, cannot be empty under the same SpaceName 
     * @return Name Data Source Name, cannot be empty under the same SpaceName
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data Source Name, cannot be empty under the same SpaceName
     * @param Name Data Source Name, cannot be empty under the same SpaceName
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Region Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Region Region to which the data source engine belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type Data Source Type: enumerated valuesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClusterId Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClusterId Cluster ID to which the data source belongs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Version information of the data source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Version Version information of the data source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version information of the data source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Version Version information of the data source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Attached parameter information of the data source Params JSON string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParamsString Attached parameter information of the data source Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParamsString() {
        return this.ParamsString;
    }

    /**
     * Set Attached parameter information of the data source Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParamsString Attached parameter information of the data source Params JSON string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParamsString(String ParamsString) {
        this.ParamsString = ParamsString;
    }

    /**
     * Get Distinguish whether the data source type is a custom Definition source or a system source
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Category Distinguish whether the data source type is a custom Definition source or a system source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Distinguish whether the data source type is a custom Definition source or a system source
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Category Distinguish whether the data source type is a custom Definition source or a system source
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public DatasourceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceBaseInfo(DatasourceBaseInfo source) {
        if (source.DatabaseNames != null) {
            this.DatabaseNames = new String[source.DatabaseNames.length];
            for (int i = 0; i < source.DatabaseNames.length; i++) {
                this.DatabaseNames[i] = new String(source.DatabaseNames[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ParamsString != null) {
            this.ParamsString = new String(source.ParamsString);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DatabaseNames.", this.DatabaseNames);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ParamsString", this.ParamsString);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

