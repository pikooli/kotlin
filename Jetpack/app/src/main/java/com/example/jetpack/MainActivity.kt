package com.example.jetpack

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetPack()
                }
            }
        }
    }
}

@Composable
fun JetPack(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.composearticle_background)
    Column(modifier = modifier) {

        Image(painter = image, contentDescription = null)
        Column(modifier = modifier) {
            Text(
                fontSize = 24.sp,
                text = stringResource(R.string.jetpack_compose_tutorial),
                modifier = modifier
                    .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.jetpack_compose_is_a_modern_toolkit_for_building_native_android_ui_compose_simplifies_and_accelerates_ui_development_on_android_with_less_code_powerful_tools_and_intuitive_kotlin_apis),
                modifier = modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = stringResource(R.string.in_this_tutorial_you_build_a_simple_ui_component_with_declarative_functions_you_call_compose_functions_to_say_what_elements_you_want_and_the_compose_compiler_does_the_rest_compose_is_built_around_composable_functions_these_functions_let_you_define_your_app_s_ui_programmatically_because_they_let_you_describe_how_it_should_look_and_provide_data_dependencies_rather_than_focus_on_the_process_of_the_ui_s_construction_such_as_initializing_an_element_and_then_attaching_it_to_a_parent_to_create_a_composable_function_you_add_the_composable_annotation_to_the_function_name),
                modifier = modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
fun Task(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.task_completed)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.all_tasks_completed),
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,

            )
        Text(
            text = stringResource(R.string.nice_work),
            modifier = modifier,
            fontSize = 16.sp
        )
    }
}


@Composable
fun QuadrantFragment(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,

            )
        Text(
            text = description,
            modifier = Modifier,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Row(modifier = modifier.weight(1f)) {
            QuadrantFragment(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)

            )
            QuadrantFragment(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFD0BCFF)
            )
        }
        Row(modifier = modifier.weight(1f)) {
            QuadrantFragment(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                modifier = Modifier.weight(1f), backgroundColor = Color(0xFFB69DF8)
            )
            QuadrantFragment(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetPackPreview() {
    JetPackTheme {
        //JetPack()
        //Task()
        Quadrant()
    }
}