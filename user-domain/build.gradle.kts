plugins {
}

dependencies {

    implementation(Dependencies.VALIDATION)
    implementation(Dependencies.JACKSON)
    kapt(Dependencies.MAPSTRUCT_APT)
    implementation(Dependencies.SPRING_DATA_JPA)
    runtimeOnly(Dependencies.MYSQL_DRIVER)

    implementation(project(":user-domain"))
}
