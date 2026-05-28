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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfo extends AbstractModel {

    /**
    * Cell content
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cells")
    @Expose
    private TableCellInfo [] Cells;

    /**
    * Type of text in the image. Valid values:
0: Non-table text
1: Text in a bordered table
2: Text in a borderless table
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The coordinates of the four vertices (upper-left, upper-right, lower-right, and lower-left) of the table body.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableCoordPoint")
    @Expose
    private Coord [] TableCoordPoint;

    /**
     * Get Cell content
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Cells Cell content
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public TableCellInfo [] getCells() {
        return this.Cells;
    }

    /**
     * Set Cell content
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Cells Cell content
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setCells(TableCellInfo [] Cells) {
        this.Cells = Cells;
    }

    /**
     * Get Type of text in the image. Valid values:
0: Non-table text
1: Text in a bordered table
2: Text in a borderless table
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Type Type of text in the image. Valid values:
0: Non-table text
1: Text in a bordered table
2: Text in a borderless table
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type of text in the image. Valid values:
0: Non-table text
1: Text in a bordered table
2: Text in a borderless table
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Type Type of text in the image. Valid values:
0: Non-table text
1: Text in a bordered table
2: Text in a borderless table
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The coordinates of the four vertices (upper-left, upper-right, lower-right, and lower-left) of the table body.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableCoordPoint The coordinates of the four vertices (upper-left, upper-right, lower-right, and lower-left) of the table body.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Coord [] getTableCoordPoint() {
        return this.TableCoordPoint;
    }

    /**
     * Set The coordinates of the four vertices (upper-left, upper-right, lower-right, and lower-left) of the table body.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableCoordPoint The coordinates of the four vertices (upper-left, upper-right, lower-right, and lower-left) of the table body.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableCoordPoint(Coord [] TableCoordPoint) {
        this.TableCoordPoint = TableCoordPoint;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.Cells != null) {
            this.Cells = new TableCellInfo[source.Cells.length];
            for (int i = 0; i < source.Cells.length; i++) {
                this.Cells[i] = new TableCellInfo(source.Cells[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TableCoordPoint != null) {
            this.TableCoordPoint = new Coord[source.TableCoordPoint.length];
            for (int i = 0; i < source.TableCoordPoint.length; i++) {
                this.TableCoordPoint[i] = new Coord(source.TableCoordPoint[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Cells.", this.Cells);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "TableCoordPoint.", this.TableCoordPoint);

    }
}

