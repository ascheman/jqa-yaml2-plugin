package com.buschmais.jqassistant.plugin.yaml2.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;

/* tag::doc[]

[[yaml2item]]
== An Item in a Sequence

Each item of a sequence is also labled with `:Item`.

.Used Combination of Labels
[cols="1h,2"]
|===

tag::labeloverview[]

ifdef::iov[| <<yaml2item,item>>]
ifndef::iov[| Used labels]
| `:Yaml:Item`

end::labeloverview[]

|===

.Additional Labels of an Item
[cols="1,1,2",options="header"]
|===
| Label
| Existence
| Description

include::YMLFirstDescriptor.java[tag=labeldoc]
include::YMLLastDescriptor.java[tag=labeldoc]

|===

end::doc[] */
@Label("Item")
public interface YMLItemDescriptor extends YMLDescriptor {
}
