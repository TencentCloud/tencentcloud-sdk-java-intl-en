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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDLCTableRequest extends AbstractModel {

    /**
    * Data table configuration information
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * Table type
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Data table column information
    */
    @SerializedName("Columns")
    @Expose
    private TColumn [] Columns;

    /**
    * Data table partition information
    */
    @SerializedName("Partitions")
    @Expose
    private TPartition [] Partitions;

    /**
    * Data table attribute information
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * External table configuration information
    */
    @SerializedName("ExternalDataConfiguration")
    @Expose
    private ExternalDataConfiguration ExternalDataConfiguration;

    /**
    * Engine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Resource group name
    */
    @SerializedName("ResourceGroupname")
    @Expose
    private String ResourceGroupname;

    /**
     * Get Data table configuration information 
     * @return TableBaseInfo Data table configuration information
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set Data table configuration information
     * @param TableBaseInfo Data table configuration information
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get Table type 
     * @return TableType Table type
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table type
     * @param TableType Table type
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Data table column information 
     * @return Columns Data table column information
     */
    public TColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Data table column information
     * @param Columns Data table column information
     */
    public void setColumns(TColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Data table partition information 
     * @return Partitions Data table partition information
     */
    public TPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Data table partition information
     * @param Partitions Data table partition information
     */
    public void setPartitions(TPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Data table attribute information 
     * @return Properties Data table attribute information
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Data table attribute information
     * @param Properties Data table attribute information
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get External table configuration information 
     * @return ExternalDataConfiguration External table configuration information
     */
    public ExternalDataConfiguration getExternalDataConfiguration() {
        return this.ExternalDataConfiguration;
    }

    /**
     * Set External table configuration information
     * @param ExternalDataConfiguration External table configuration information
     */
    public void setExternalDataConfiguration(ExternalDataConfiguration ExternalDataConfiguration) {
        this.ExternalDataConfiguration = ExternalDataConfiguration;
    }

    /**
     * Get Engine name 
     * @return DataEngineName Engine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Engine name
     * @param DataEngineName Engine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Resource group name 
     * @return ResourceGroupname Resource group name
     */
    public String getResourceGroupname() {
        return this.ResourceGroupname;
    }

    /**
     * Set Resource group name
     * @param ResourceGroupname Resource group name
     */
    public void setResourceGroupname(String ResourceGroupname) {
        this.ResourceGroupname = ResourceGroupname;
    }

    public CreateDLCTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDLCTableRequest(CreateDLCTableRequest source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.Columns != null) {
            this.Columns = new TColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new TColumn(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new TPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new TPartition(source.Partitions[i]);
            }
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.ExternalDataConfiguration != null) {
            this.ExternalDataConfiguration = new ExternalDataConfiguration(source.ExternalDataConfiguration);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ResourceGroupname != null) {
            this.ResourceGroupname = new String(source.ResourceGroupname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamObj(map, prefix + "ExternalDataConfiguration.", this.ExternalDataConfiguration);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ResourceGroupname", this.ResourceGroupname);

    }
}

